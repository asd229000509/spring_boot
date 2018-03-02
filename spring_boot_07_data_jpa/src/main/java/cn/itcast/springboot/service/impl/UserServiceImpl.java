package cn.itcast.springboot.service.impl;

import cn.itcast.springboot.dao.UserRespository;
import cn.itcast.springboot.pojo.User;
import cn.itcast.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRespository userRespository;
    @Override
    public List<User> findByUserNameLikeOrderByAgeDesc(String userName) {
        return userRespository.findByUserNameLikeOrderByAgeDesc(userName);
    }

    @Override
    public User updateById(User user) {
        return userRespository.save(user);
    }
}
