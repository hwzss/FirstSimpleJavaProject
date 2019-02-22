package com.xiaohu.mapper;

import com.xiaohu.entity.User;

import java.util.List;

public interface UserMapper {
    List<User> queryUser();
    int updateUserName(User model);
    int insertUser(User model);
}
