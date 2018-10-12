package com.liukun.mapper;

import com.liukun.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    public User findUserById(@Param("id") Integer id);

    public List<User> findall();

    public void deleteUserById(@Param("id") Integer id);

    public void updateUserNameById(@Param("id") Integer id, @Param("name") String name);

    public Integer getUserByName(@Param("name")String name);

}
