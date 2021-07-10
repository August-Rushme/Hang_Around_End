package com.august.hang_around.req;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

/**
 * @author august
 */
public class UserResetReq {
    /**
     *      @NotEmpty(message = "【Id】不能为空")
     */

    private Long id;
    /**
     *  @Length(min = 6, max = 20, message = "【密码】6~20位")
     */

    @Pattern(regexp = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,32}$", message = "【密码】规则不正确")
    private String password;

    private String username;

    private String birthday;

    private String habit;
    @NotEmpty(message = "【性别】不能为空")
    private String sex;

    private String signature;

    private String avatar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHabit() {
        return habit;
    }

    public void setHabit(String habit) {
        this.habit = habit;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "UserResetReq{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", birthday='" + birthday + '\'' +
                ", habit='" + habit + '\'' +
                ", sex='" + sex + '\'' +
                ", signature='" + signature + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
