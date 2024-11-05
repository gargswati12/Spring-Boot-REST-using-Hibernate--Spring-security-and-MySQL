package com.swati.springboot.crudrole.dao;

import com.swati.springboot.crudrole.entity.User;

public interface UserDao {

    User findByUserName(String userName);
    
}
