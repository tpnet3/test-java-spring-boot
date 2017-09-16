package com.example.mapper;

import com.example.object.UserObject;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TestMapper {

    @Select("SELECT * FROM service")
    List<UserObject> getAll();
}
