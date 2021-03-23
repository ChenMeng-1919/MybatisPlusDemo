package com.mybatisplus.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybatisplus.demo.pojo.User;
import org.springframework.stereotype.Repository;

/*
 * @author: cm
 * @date: Created in 2021/3/22 10:48
 * @description:
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}
