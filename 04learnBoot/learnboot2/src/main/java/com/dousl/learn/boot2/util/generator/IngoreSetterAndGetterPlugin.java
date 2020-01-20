package com.dousl.learn.boot2.util.generator;

//import com.baomidou.mybatisplus.toolkit.StringUtils;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.TableConfiguration;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class IngoreSetterAndGetterPlugin extends PluginAdapter {

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass,
                                                 IntrospectedTable introspectedTable) {
        //该代码表示在生成class的时候，向topLevelClass添加注解
        topLevelClass.addImportedType("com.baomidou.mybatisplus.extension.activerecord.Model");
        topLevelClass.addImportedType("com.baomidou.mybatisplus.annotation.TableName");
        topLevelClass.addImportedType("java.io.Serializable");
        topLevelClass.addImportedType("lombok.*");
        topLevelClass.addAnnotation("@Setter");
        topLevelClass.addAnnotation("@Getter");
        topLevelClass.addAnnotation("@ToString");
        topLevelClass.addAnnotation("@Data");
        topLevelClass.addAnnotation("@EqualsAndHashCode(callSuper = true)");
        topLevelClass.addAnnotation("@TableName(\""+introspectedTable.getTableConfiguration().getTableName()+"\")");

        TableConfiguration table = introspectedTable.getTableConfiguration();

        //添加Model实现方法pkVal()
        CommentGenerator commentGenerator = context.getCommentGenerator();
        Method method = new Method("method");
        method.addJavaDocLine("@Override");
        method.setVisibility(JavaVisibility.PROTECTED);
        method.setReturnType(new FullyQualifiedJavaType("Serializable"));
        method.setName("pkVal");
        method.addBodyLine("return null;");
        commentGenerator.addGeneralMethodComment(method, introspectedTable);
        topLevelClass.addMethod(method);

        return super.modelBaseRecordClassGenerated(topLevelClass,
                introspectedTable);
    }

    //该方法在生成每一个属性的getter方法时候调用，如果我们不想生成getter，直接返回false即可；
    @Override
    public boolean modelGetterMethodGenerated(Method method,
                                              TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn,
                                              IntrospectedTable introspectedTable,
                                              ModelClassType modelClassType) {
        return false;
    }

    //该方法在生成每一个属性的setter方法时候调用，如果我们不想生成setter，直接返回false即可；
    @Override
    public boolean modelSetterMethodGenerated(Method method,
                                              TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn,
                                              IntrospectedTable introspectedTable,
                                              ModelClassType modelClassType) {
        return false;
    }

    @Override
    public boolean clientGenerated(Interface interfaze, IntrospectedTable introspectedTable) {
        String author = introspectedTable.getTableConfigurationProperty("author");
        String dateFormat = properties.getProperty("dateFormat", "yyyy-MM-dd");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
        //SimpleDateFormat dateFormatter = new SimpleDateFormat(dateFormat);

        // 获取表注释
        String remarks = introspectedTable.getRemarks();

        interfaze.addJavaDocLine("/**");
        if(StringUtils.isNotEmpty(remarks)){
            interfaze.addJavaDocLine(" * " + remarks);
            interfaze.addJavaDocLine(" *");
        }
        interfaze.addJavaDocLine(" * @author " + author);
        interfaze.addJavaDocLine(" * @date " + formatter.format(LocalDate.now()));
        interfaze.addJavaDocLine(" */");

        interfaze.addImportedType(new FullyQualifiedJavaType("com.baomidou.mybatisplus.core.mapper.BaseMapper"));
        interfaze.addImportedType(new FullyQualifiedJavaType("com.dousl.learn.boot2.domain."+introspectedTable.getTableConfiguration().getDomainObjectName()));

        return super.clientGenerated(interfaze,introspectedTable);
    }

    @Override
    public boolean clientInsertMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable) {
        return false;
    }

    @Override
    public boolean sqlMapInsertElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }

    @Override
    public boolean sqlMapResultMapWithoutBLOBsElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }

    @Override
    public boolean clientSelectAllMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable) {
        return false;
    }


    @Override
    public boolean sqlMapSelectAllElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }
}
