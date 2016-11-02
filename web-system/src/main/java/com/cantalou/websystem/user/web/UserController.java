package com.cantalou.websystem.user.web;

import com.cantalou.user.domain.User;
import com.cantalou.websystem.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LinZhiWei
 * @date 2016/11/2 16:05
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/getUser")
    public User getUser(@RequestParam("id") long id) {
        return userService.getUser(id);
    }
}
