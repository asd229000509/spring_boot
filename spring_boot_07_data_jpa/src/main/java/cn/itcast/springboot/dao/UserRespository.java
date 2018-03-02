package cn.itcast.springboot.dao;

import cn.itcast.springboot.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRespository extends JpaRepository<User,Long> {

    List<User> findByUserNameLikeOrderByAgeDesc(String userName);
}
