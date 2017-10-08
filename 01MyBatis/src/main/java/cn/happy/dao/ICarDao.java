package cn.happy.dao;

import cn.happy.entity.Car;

import java.util.List;

/**
 * Created by 13447 on 2017/9/21.
 */
public interface ICarDao {

    public List<Car> getCarAllList(int pid);
}
