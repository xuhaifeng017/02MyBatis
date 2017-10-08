package cn.happy.entity;

import java.util.List;

/**
 * Created by 13447 on 2017/9/21.
 */
public class Result {

    private  Integer resultno;
    private  String resultname;
    private List<UserInfo> userlist;

    public List<UserInfo> getUserlist() {
        return userlist;
    }

    public void setUserlist(List<UserInfo> userlist) {
        this.userlist = userlist;
    }

    public Integer getResultno() {
        return resultno;
    }

    public void setResultno(Integer resultno) {
        this.resultno = resultno;
    }

    public String getResultname() {
        return resultname;
    }

    public void setResultname(String resultname) {
        this.resultname = resultname;
    }
}
