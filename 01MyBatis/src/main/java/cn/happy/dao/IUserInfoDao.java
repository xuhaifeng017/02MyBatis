package cn.happy.dao;

import cn.happy.entity.Result;
import cn.happy.entity.UserInfo;

import java.util.List;
import java.util.Map;

/**
 * Created by 13447 on 2017/9/11.
 */
public interface IUserInfoDao {

    public UserInfo getByuserid(int id);

    public List<UserInfo> getAllList();

    public void insertList(UserInfo userInfos);

    public void  updateuser(UserInfo userInfos);

    public Boolean  deleteuser(int id);

    public  List<UserInfo> getmohuAll(UserInfo user);

    public List<UserInfo> getfindAll(Map<String,Object> map);

    public List<UserInfo> getfindAlls(String username,int userid);

    /*<!--智能标签if-->*/
    public  List<UserInfo> getmohuAlls(UserInfo user);
    /*<!--智能标签chonse-->*/
    public  List<UserInfo> getmohuAlls1(UserInfo user);
    /*<!--智能标签foreach-->*/
    public  List<UserInfo> getarrayAllList(int [] ids);

    public Result  getallss(int resultno);
}
