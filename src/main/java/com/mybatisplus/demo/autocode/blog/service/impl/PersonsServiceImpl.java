package com.mybatisplus.demo.autocode.blog.service.impl;

import com.mybatisplus.demo.autocode.blog.entity.Persons;
import com.mybatisplus.demo.autocode.blog.mapper.PersonsMapper;
import com.mybatisplus.demo.autocode.blog.service.PersonsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cm
 * @since 2021-03-24
 */
@Service
public class PersonsServiceImpl extends ServiceImpl<PersonsMapper, Persons> implements PersonsService {

}
