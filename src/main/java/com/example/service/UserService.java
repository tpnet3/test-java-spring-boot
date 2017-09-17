package com.example.service;

import com.example.mapper.SomeMapper;
import com.example.object.UserObject;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private SomeMapper someMapper;

    public UserService(SomeMapper someMapper) {
        this.someMapper = someMapper;
    }

    public List<UserObject> someMapperList() {
        return someMapper.selectAll();
    }
}
