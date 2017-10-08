package cn.happy;

import cn.happy.day02.printer.Print;
import cn.happy.day04.Student;
import cn.happy.day05.MyCollection;
import com.sun.xml.internal.bind.v2.runtime.ClassBeanInfoImpl;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


/**
 * Created by 13447 on 2017/9/28.
 */
public class Test003 {

    @Test
    public void test01(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext04.xml");

        Student stu = (Student) context.getBean("stu");

        System.out.println(stu);
    }
    @Test
    public void test02(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext05.xml");

        MyCollection mc = (MyCollection) context.getBean("mycoll");

        System.out.println(mc);
    }

        @Test
    public void test03(){

            Resource resource=new ClassPathResource("applicationContext06.xml");
            BeanFactory beanFactory=new XmlBeanFactory(resource);
            Student student=(Student)beanFactory.getBean("stu1");
            System.out.println(student);
        }


}
