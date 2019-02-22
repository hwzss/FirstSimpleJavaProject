package com.xiaohu.firstProject;


import com.xiaohu.mapper.UserMapper;
import com.xiaohu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/home")
    public String showHome() {
        return "welcome here!";
    }

    @RequestMapping("/fetch/all/user")
    public List<User> fetchAllUser() {
        return userMapper.queryUser();
    }

    @RequestMapping("/add/user")
    public Object addUser(String name) {
        try {
            User user = new User();
            user.setName(name);
            int result = userMapper.insertUser(user);
            if (result == 0) {
                return "插入失败";
            }
            return "插入成功";
        }catch (Exception e) {
            e.printStackTrace();
            return "发生错误";
        }
    }

    @RequestMapping("/update/username")
    public Object updateUserName(String name, String id) {
        try {
            User user = new User();
            user.setUserId(id);
            user.setName(name);
            int result = userMapper.updateUserName(user);
            if (result == 0) {
                return "发生错误";
            }
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            return "服务错误";
        }


    }

}


