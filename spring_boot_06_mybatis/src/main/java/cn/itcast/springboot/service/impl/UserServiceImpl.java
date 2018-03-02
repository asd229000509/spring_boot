package cn.itcast.springboot.service.impl;

import cn.itcast.springboot.mapper.UserMapper;
import cn.itcast.springboot.pojo.User;
import cn.itcast.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUserByName(String name) {
        return userMapper.queryUserByName(name);
    }

    @Override
    public List<User> queryUsers() {
        try {
            List<User> users = userMapper.queryUsers();
            return users;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
