package org.taru.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.taru.dao.loginDao;
import org.taru.domel.User;
import org.taru.service.LoginService;
@Service
public class loginServiceImpl implements LoginService {
    @Autowired
    loginDao loginDao;
    @Override
    public User queryforLogin(String id) {
        User user=loginDao.queryforLogin(id);
        return user;
    }
}
