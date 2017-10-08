package cn.happy.entity;

/**
 * Created by 13447 on 2017/9/11.
 */
public class UserInfo {
    private  Integer userid;

    private  String username;

    private  String userpwd;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }
}
