package com.mybatisplus.demo;

import com.mybatisplus.demo.mapper.UserMapper;
import com.mybatisplus.demo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testInsert(){
        User user = new User();
        user.setId(6372);
        user.setName("陈萌说");
        user.setAge(3);
        user.setEmail("24736743@qq.com");
        /*int result = userMapper.insert(user); // 帮我们自动生成id*/
        int result = userMapper.updateById(user);
        System.out.println(result); // 受影响的行数
        System.out.println(user); // 发现，id会自动回填
    }

}
