package cn.happy;

import cn.happy.day02.printer.Print;
import cn.happy.service.ISomeService;
import cn.happy.service.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 13447 on 2017/9/28.
 */
public class Test002 {

    @Test
    public void test01(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContextso.xml");

        ISomeService service = (ISomeService ) context.getBean("someService");

       service.doSome();
    }

}
