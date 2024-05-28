package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    User findById(Integer id);

    void insertUser(User user);
}
