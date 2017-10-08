package cn.happy;

import cn.happy.day.HappyService;
import cn.happy.day02.printer.Print;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 13447 on 2017/9/28.
 */
public class Test001 {

    @Test
    public void test01(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        Print print = (Print) context.getBean("print");

        print.getprintSometing();
    }

}
