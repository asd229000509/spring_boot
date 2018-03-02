package cn.itcast.springboot.service;

import cn.itcast.springboot.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    public List<User> queryUserByName(@Param("name") String name);

    //使用UserMapper映射文件
    public List<User> queryUsers();
}
