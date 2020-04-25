package com.yyx.service.impl;

import com.yyx.mapper.PersonMapper;
import com.yyx.pojo.Person;
import com.yyx.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    /*注入mapper*/
    @Autowired
    private PersonMapper personMapper;

    @Override
    public Person ServiceLogin(String name, Integer password) {
        Person person = personMapper.LoginPer(name, password);
        return person;
    }
}
