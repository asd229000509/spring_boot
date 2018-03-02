package cn.itcast.springboot.mapper;

import cn.itcast.springboot.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from tb_user where user_name like '%${name}%'")
    public List<User> queryUserByName(@Param("name") String name);

    //使用UserMapper映射文件
    public List<User> queryUsers();
}
