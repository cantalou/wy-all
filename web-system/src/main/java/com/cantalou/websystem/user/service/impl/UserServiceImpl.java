package com.cantalou.websystem.user.service.impl;

import com.cantalou.user.domain.User;
import com.cantalou.websystem.user.dao.UserDao;
import com.cantalou.websystem.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LinZhiWei
 * @date 2016/11/2 15:27
 */
@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public User getUser(long id) {
        LOGGER.debug("getUser by id {} from dao ", id, userDao);
        User user = new User();
        user.setId(id);
        return user;
    }
}
