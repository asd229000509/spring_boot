package cn.itcast.springboot.service;

import cn.itcast.springboot.pojo.User;

import java.util.List;

public interface UserService {
    public List<User> findByUserNameLikeOrderByAgeDesc(String userName);

    public User updateById(User user);
}
