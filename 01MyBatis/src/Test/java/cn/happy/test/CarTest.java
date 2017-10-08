package cn.happy.test;

import cn.happy.dao.ICarDao;
import cn.happy.entity.Car;
import cn.happy.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Created by 13447 on 2017/9/21.
 */
public class CarTest {
    @Test
    public  void ssss(){
        SqlSession session= MyBatisUtil.getSession();
        ICarDao mapper = session.getMapper(ICarDao.class);
        List<Car> carAllList = mapper.getCarAllList(1);
        for (Car car:carAllList) {
            System.out.println(car);
        }
    }
}
