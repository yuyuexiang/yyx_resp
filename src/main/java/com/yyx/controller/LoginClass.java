package com.yyx.controller;

import com.yyx.pojo.Person;
import com.yyx.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resources;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginClass {
    /*注入service*/
    @Autowired
    private PersonService personService;

    /*登录接口*/
    @RequestMapping("/login")
    public String login(Person person){
        Person person1 = personService.ServiceLogin(person.getName(), person.getPassword());
        if(person1!=null){
            /*登录成功*/
            return "redirect:/ok.jsp";
        }
        //失败，请求转发到登录页面
        return "login";
    }

    /*ajax接口*/
    @ResponseBody
    @RequestMapping("/ajax")
    public Object MyAjax(Person person, HttpServletResponse resp){
        /*设置浏览器打开响应数据的编码格式*/
        resp.setContentType("text/html;chartset=utf-8");
        System.out.println(person);
        Person person1 = personService.ServiceLogin(person.getName(), person.getPassword());
        return person1;
    }


    /*restful风格声明公共跳转接口*/
    @RequestMapping("{uri}")
    public String restful(@PathVariable("uri") String uri){
        return uri;
    }

    public static void main(String[] args) {

    }
}
