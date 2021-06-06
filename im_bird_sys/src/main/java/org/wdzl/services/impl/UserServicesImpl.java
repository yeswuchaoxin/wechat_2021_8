package org.wdzl.services.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.wdzl.mapper.*;
import org.wdzl.pojo.User;
import org.wdzl.services.UserServices;

@Service
public class UserServicesImpl implements UserServices {
    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById(String id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
