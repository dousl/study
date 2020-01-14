package com.dousl.learnboot1.web;

import com.dousl.learnboot1.domain.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

/**
 * 测试RESTful API
 *
 * @author dousl
 * @Class UserController
 * @Description
 * @Date 2020-01-13 13:54
 **/
@Api(tags = "4-用户管理")
@RestController
@RequestMapping("/users")
public class UserController {
    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());

    /**
     * 处理"/users/"的GET请求，用来获取用户列表
     *
     * @param
     * @return java.util.List<com.dousl.learnboot1.domain.User>
     * @author dousl
     * @description
     * @date 2020-01-13 13:59
     **/
    @GetMapping("/")
    @ApiOperation("获取用户列表")
    public List<User> getUserList() {
        List<User> userList = new ArrayList<User>(users.values());
        return userList;
    }

    /**
     * 处理"/users/"的POST请求，用来创建User
     *
     * @param user
     * @return java.lang.String
     * @author dousl
     * @description
     * @date 2020-01-13 14:11
     **/
    @PostMapping("/")
    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
    public String postUser(@Valid @RequestBody User user) {
        users.put(user.getId(), user);
        return "SUCCESS";
    }

    /**
     * 根据id获取用户
     *
     * @param id
     * @return com.dousl.learnboot1.domain.User
     * @author dousl
     * @description
     * @date 2020-01-13 14:13
     **/
    @GetMapping("/{id}")
    @ApiOperation(value = "获取用户详细信息", notes = "根据url的id来获取用户详细信息")
    public User getUserById(@PathVariable Long id) {
        return users.get(id);
    }

    /**
     * 更新用户信息
     *
     * @param id
     * @param user
     * @return java.lang.String
     * @author dousl
     * @description
     * @date 2020-01-13 14:19
     **/
    @PutMapping("/{id}")
    @ApiOperation(value = "更新用户详细信息", notes = "根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
    @ApiImplicitParam(paramType = "path", dataType = "Long", name = "id", value = "用户编号", required = true, example = "1")
    public String updateUserById(@PathVariable Long id, @RequestBody User user) {
        User uu = users.get(id);
        uu.setAge(user.getAge());
        uu.setId(user.getId());
        uu.setName(user.getName());
        users.put(id, uu);
        return "SUCCESS";
    }

    /**
     * 根据id删除用户
     *
     * @param id
     * @return java.lang.String
     * @author dousl
     * @description
     * @date 2020-01-13 14:19
     **/
    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除用户", notes = "根据url的id来指定删除对象")
    public String deleteUser(@PathVariable Long id) {
        users.remove(id);
        return "SUCCESS";
    }

}
