package com.learningcity.coil;


import com.learningcity.coil.service.WidgetService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: Yohan
 * Date: 6/22/13
 * Time: 6:55 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Started");
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        System.out.println(obj.getMessage());

        WidgetService widgetService = (WidgetService) context.getBean("widgetService");
        Properties properties = new Properties();
        properties.setProperty("name", "Yohan Lee");
        System.out.println(widgetService.create(properties).getName());
    }
}
