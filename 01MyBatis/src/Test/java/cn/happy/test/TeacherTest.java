package cn.happy.test;

import cn.happy.dao.ITeacherDao;
import cn.happy.entity.Student;
import cn.happy.entity.Teacher;
import cn.happy.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Created by 13447 on 2017/9/23.
 */
public class TeacherTest {

    @Test
    public  void  sss(){
        String path = System.getProperty("java.io.tmpdir");
                System.out.println(path);

    }

    @Test
    public void teacherstudent(){
        SqlSession session =MyBatisUtil.getSession();
        ITeacherDao mapper = session.getMapper(ITeacherDao.class);
        Teacher teacherById = mapper.getTeacherById(1);
        System.out.println(teacherById.getTname());
        for (Student item:teacherById.getList()) {
            System.out.println(item.getSname());
        }
    }
    @Test
    public  void  teacherall(){
        SqlSession session =MyBatisUtil.getSession();
        ITeacherDao mapper = session.getMapper(ITeacherDao.class);
        List<Teacher> list = mapper.getfindAll();
        System.out.println(list);

        System.out.println("=========分割线");
        List<Teacher> list1 = mapper.getfindAll();
        System.out.println(list1);
    }

}
