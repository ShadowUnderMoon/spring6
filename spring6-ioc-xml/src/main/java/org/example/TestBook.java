package org.example;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {

    @Test
    public void testSetter() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-di.xml");

        Book book = (Book) applicationContext.getBean("book");

        System.out.println(book);
    }

    @Test
    public void testConstructor() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-di.xml");

        Book book = (Book) applicationContext.getBean("bookCon");

        System.out.println(book);
    }
}
