package com.yyx.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
       int i=1;
       i=i++;
       int j=i++;
       int k=i + ++i *  i++;
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("k="+k);


    }
}
