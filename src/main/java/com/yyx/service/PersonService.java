package com.yyx.service;

import com.yyx.pojo.Person;

public interface PersonService {

    /*登录*/
    Person ServiceLogin(String name,Integer password);
}
