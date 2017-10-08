package cn.happy.test;

import cn.happy.dao.IUserInfoDao;
import cn.happy.entity.UserInfo;
import cn.happy.util.MyBatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 13447 on 2017/9/11.
 */
public class MyBatisTest {

    @Test
    public  void testall(){

        try {
            SqlSession session= MyBatisUtil.getSession();
            List<UserInfo> list=session.selectList("cn.happy.dao.IUserInfoDao.getAllList");
            for (UserInfo userinfo:list
                 ) {
                System.out.println(userinfo.getUsername());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void  sss11(){


    }





    @Test
    public void testalls3(){

        try {
            SqlSession session= MyBatisUtil.getSession();
            IUserInfoDao userin = session.getMapper(IUserInfoDao.class);
            List<UserInfo>  list= userin.getfindAlls("沙",3);
            for (UserInfo userinfo:list
                    ) {
                System.out.println(userinfo.getUserid());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testalls2(){

        try {
            SqlSession session= MyBatisUtil.getSession();
            IUserInfoDao userin = session.getMapper(IUserInfoDao.class);
            Map<String,Object> map=new HashMap<String, Object>();
            map.put("username","沙");
            map.put("userid",2);
            List<UserInfo>  list= userin.getfindAll(map);
            for (UserInfo userinfo:list
                    ) {
                System.out.println(userinfo.getUsername());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testalls1(){

        try {
            SqlSession session= MyBatisUtil.getSession();
            IUserInfoDao userin = session.getMapper(IUserInfoDao.class);
            UserInfo user=new UserInfo();
            user.setUsername("哈");
            List<UserInfo> list = userin.getmohuAll(user);
            for (UserInfo userinfo:list
                    ) {
                System.out.println(userinfo.getUsername());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     /*智能标签查询if*/
    @Test
    public void testalls4(){

        try {
            SqlSession session= MyBatisUtil.getSession();
            IUserInfoDao userin = session.getMapper(IUserInfoDao.class);
            UserInfo user=new UserInfo();
            user.setUsername("哈");
            user.setUserid(3);
            List<UserInfo> list = userin.getmohuAlls(user);
            for (UserInfo userinfo:list
                    ) {
                System.out.println(userinfo.getUsername());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*智能标签查询foreach*/
    @Test
    public void testalls5(){

        try {
            SqlSession session= MyBatisUtil.getSession();
            IUserInfoDao userin = session.getMapper(IUserInfoDao.class);
             int [] ist={5,6};
            List<UserInfo> list = userin.getarrayAllList(ist);
            for (UserInfo userinfo:list
                    ) {
                System.out.println(userinfo.getUsername());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*智能标签查询foreach*/
    @Test
    public void testalls6(){

        try {
            SqlSession session= MyBatisUtil.getSession();
            IUserInfoDao userin = session.getMapper(IUserInfoDao.class);
            UserInfo user=new UserInfo();
            /*user.setUsername("哈");*/
            List<UserInfo> list = userin.getmohuAlls1(user);
            for (UserInfo userinfo:list
                    ) {
                System.out.println(userinfo.getUsername());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testalls(){

        try {
            SqlSession session= MyBatisUtil.getSession();
            IUserInfoDao userin = session.getMapper(IUserInfoDao.class);
            List<UserInfo> list = userin.getAllList();
            for (UserInfo userinfo:list
                    ) {
                System.out.println(userinfo.getUsername());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   //增加
    @Test
    public void inserts(){

        try {
            SqlSession session= MyBatisUtil.getSession();
            UserInfo userinfos=new UserInfo();
            userinfos.setUsername("哈士奇");
            userinfos.setUserpwd("x123");
            IUserInfoDao userin = session.getMapper(IUserInfoDao.class);
            userin.insertList(userinfos);
            System.out.println(userinfos.getUserid());
            session.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //修改
    @Test
    public void updates(){

        try {
            SqlSession session= MyBatisUtil.getSession();
            IUserInfoDao userin = session.getMapper(IUserInfoDao.class);
            UserInfo userInfos=userin.getByuserid(5);
            System.out.println(userInfos.getUserid());
            if(userInfos!=null){
                userInfos.setUsername("添加轩辕");
                userin.updateuser(userInfos);
                session.commit();
            }
             System.out.print(userInfos.getUsername());
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //删除
    @Test
    public void deletes(){

        try {
            SqlSession session= MyBatisUtil.getSession();
            IUserInfoDao userin = session.getMapper(IUserInfoDao.class);
            Boolean flag=userin.deleteuser(2);
               if(flag){
                   System.out.print(flag);
                   session.commit();
               }
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
