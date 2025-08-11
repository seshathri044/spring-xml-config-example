package org.example;

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

        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        student nw = (student) context.getBean("st1");
        nw.setAge(25);
        System.out.println(nw.getAge());
        nw.writeExam();
    }

}
