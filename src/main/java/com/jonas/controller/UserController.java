package com.jonas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * @author shenjy
 * @createTime 2022/7/4 11:01
 * @description UserController
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/getUserName")
    public String getUserName(@PathParam("userId") int userId) {
        return "user" + userId;
    }
}
