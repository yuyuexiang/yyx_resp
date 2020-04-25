package com.yyx.controller;


import com.yyx.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class TestController {


   @RequestMapping("test")
    public void test(@RequestParam("age2") int age){
       System.out.println(age);
    }

    @RequestMapping("test2")
    public void test2(Person person){
       System.out.println(person.getName());
    }

    @RequestMapping("test3/{name}/{age}")
    public void test3(@PathVariable("name")String name,@PathVariable("age") int age){
       System.out.println(name+"===="+age);
    }
}
