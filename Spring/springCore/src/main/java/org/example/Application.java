package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String args[])
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Message ob = (Message)context.getBean("message");
        ob.getMsg();
    }

}
