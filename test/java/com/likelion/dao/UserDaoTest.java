package com.likelion.dao;

import com.likelion.domain.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    @Test
    void addAndGet() {
        UserDao userDao = new UserDaoFactory().awsUserDao();
        String id = "2";
        userDao.add(new User(id, "Kimoon", "1234"));
        User user = userDao.findById(id);
        assertEquals("Kimoon", user.getName());
        assertEquals("1234", user.getPassword());
    }
}