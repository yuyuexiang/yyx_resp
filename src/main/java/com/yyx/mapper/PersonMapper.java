package com.yyx.mapper;

import com.yyx.pojo.Person;

public interface PersonMapper {

    /*登录*/
    Person LoginPer(String name, Integer password);
}
