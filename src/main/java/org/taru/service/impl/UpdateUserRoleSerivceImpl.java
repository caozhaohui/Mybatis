package org.taru.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.taru.dao.UpdateUserRoleDao;
import org.taru.service.UpdateUserRoleSerivce;

@Service
public class UpdateUserRoleSerivceImpl implements UpdateUserRoleSerivce {
    @Autowired
    UpdateUserRoleDao updateUserRoleDao;
    @Override
    public int updateUserRole(String roleid, String userid) {
        int i=updateUserRoleDao.updateUserRole(roleid, userid);
        return i;
    }
}
