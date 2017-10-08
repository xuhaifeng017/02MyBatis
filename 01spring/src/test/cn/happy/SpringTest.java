package cn.happy;

import cn.happy.day.HappyService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by 13447 on 2017/9/28.
 */
public class SpringTest {

    @Test
    public void test01(){

        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        HappyService service = (HappyService) context.getBean("service");

        service.work();
    }
}
