package com.example.mapper;

import com.example.object.UserObject;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface SomeMapper {

    /*
    property 와 column 이름을 매핑시켜줄 수 있습니다.
    @Results({
            @Result(property = "vid", column = "id"),
            @Result(property = "villageName", column = "name"),
            @Result(property = "district", column = "district")
    })
    */

    @Select("SELECT * FROM user_info")
    List<UserObject> selectAll();

}
