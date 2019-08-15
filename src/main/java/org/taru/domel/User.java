package org.taru.domel;

import java.util.Date;

/**
 * 用户实体
 */
public class User {
    private Integer userid;
    private String username;
    private String password;
    private String email;
    private String mobile;
    private byte status;
    private String createBy;
    private Date createTime;
    private String lastUpdateBy;
    private Date lastUpdateTime;
    private byte delFlag;
    private String perms;

    public Integer getUserid() {
        return userid;
    }
    public User setUserid(Integer userid) {
        this.userid = userid;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getMobile() {
        return mobile;
    }

    public User setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public byte getStatus() {
        return status;
    }

    public User setStatus(byte status) {
        this.status = status;
        return this;
    }

    public String getCreateBy() {
        return createBy;
    }

    public User setCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public User setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public User setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
        return this;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public User setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    public byte getDelFlag() {
        return delFlag;
    }

    public User setDelFlag(byte delFlag) {
        this.delFlag = delFlag;
        return this;
    }

    public String getPerms() {
        return perms;
    }

    public User setPerms(String perms) {
        this.perms = perms;
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", status=" + status +
                ", createBy='" + createBy + '\'' +
                ", createTime=" + createTime +
                ", lastUpdateBy='" + lastUpdateBy + '\'' +
                ", lastUpdateTime=" + lastUpdateTime +
                ", delFlag=" + delFlag +
                ", perms='" + perms + '\'' +
                '}';
    }
}
