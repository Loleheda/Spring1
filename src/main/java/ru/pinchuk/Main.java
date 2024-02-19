package ru.pinchuk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.pinchuk.models.Teacher;

public class Main {
    public static void main(String[] args) {
        ApplicationContext contextXml = new ClassPathXmlApplicationContext("context.xml");
        Teacher teacherXml = (Teacher) contextXml.getBean("teacher", Teacher.class);

        System.out.println(teacherXml);
    }
}