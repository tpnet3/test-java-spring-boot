package com.example.mapper;

import com.example.object.UserObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SomeMapperTest {

    // org.apache.ibatis.binding.MapperProxy 로 클래스를 만들어서 주입됩니다.
    @Autowired
    private SomeMapper someMapper;

    @Test
    public void testSelectAll() {
        System.out.println(someMapper.getClass().getName());
        System.out.println(someMapper.toString());
        System.out.println();
        System.out.println(someMapper.selectAll());
    }
}
