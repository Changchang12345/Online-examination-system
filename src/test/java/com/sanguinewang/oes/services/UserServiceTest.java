package com.sanguinewang.oes.services;

import com.sanguinewang.oes.dataobject.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class UserServiceTest {

    @Autowired
    UserService userService;


    @Test
    void findByUsername() {
        User user = new User();
        user.setName("string");
        User byUsername = userService.findByUsername(user);
        log.info("{}", byUsername.getName());
    }

    @Test
    void findUserById() {
        User user = new User();
        user.setId(1);
        User userById = userService.findUserById(1);
        log.info("{}", userById.getId());
    }
}