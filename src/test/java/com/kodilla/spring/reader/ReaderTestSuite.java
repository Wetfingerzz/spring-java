package com.kodilla.spring.reader;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ReaderTestSuite {
    @Test
    public void testRead() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ReaderConfig.class);
        Reader reader = context.getBean(Reader.class);
        reader.read();
    }
    @Test
    public void testConditional() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ReaderConfig.class);
        boolean book2exists = context.containsBean("book2");
        System.out.println("Is book2 placed in the container: " + book2exists);
    }
}
