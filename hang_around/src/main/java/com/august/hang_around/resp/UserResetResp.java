package com.august.hang_around.resp;

/**
 * @author august
 */
public class UserResetResp {
    private Long id;

    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UserLoginResp{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
