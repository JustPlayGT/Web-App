package com.gt.test1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Properties;

public class Example1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Box box = context.getBean("box", Box.class);
        context.close();
        int i =0;
        switch (i) {
            case 0:
                i = 1;
                break;
        }


    }

}

