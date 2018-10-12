package com.liukun.service;

import com.liukun.entity.User;
import com.liukun.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    //@Autowired
    @Resource
    private UserMapper userMapper;//此处autowire可无视，属于软件问题

    public User findUserById(Integer id){
       return userMapper.findUserById(id);
    }
    public List<User> findall(){
        return userMapper.findall();
    }

    public void deleteUserById(Integer id){
        userMapper.deleteUserById(id);
    }

    public void updateUserNameById(Integer id, String name){
        userMapper.updateUserNameById(id,name);
    }
}
