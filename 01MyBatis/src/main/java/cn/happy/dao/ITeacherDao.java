package cn.happy.dao;

import cn.happy.entity.Teacher;

import java.util.List;

/**
 * Created by 13447 on 2017/9/23.
 */
public interface ITeacherDao {

    public Teacher getTeacherById(int tid);

    public List<Teacher> getfindAll();

    public List<Teacher> getfindAll2();
}