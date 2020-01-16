package com.dousl.learnBoot2.domain;

import java.util.Date;

public class SpringbootLearnDO {
    private Long pkId;

    private String userId;

    private String userName;

    private String userDesc;

    private Date createTime;

    private Date updateTime;

    public SpringbootLearnDO(Long pkId, String userId, String userName, String userDesc, Date createTime, Date updateTime) {
        this.pkId = pkId;
        this.userId = userId;
        this.userName = userName;
        this.userDesc = userDesc;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public SpringbootLearnDO() {
        super();
    }

    public Long getPkId() {
        return pkId;
    }

    public void setPkId(Long pkId) {
        this.pkId = pkId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc == null ? null : userDesc.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}