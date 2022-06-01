package com.learning.main.DemoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("web.xml");
        Student s=(Student)ac.getBean("Student");
        Employee e=(Employee)ac.getBean("Employee");
        System.out.println(s);
        System.out.println(e);
        

    }
}
