package org.taru.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.taru.dao.queryMenuDao;
import org.taru.domel.Menu;
import org.taru.service.queryMenuService;

import java.util.List;

@Service
public class QueryMenuServiceImpl1 implements queryMenuService {
    @Autowired
    org.taru.dao.queryMenuDao queryMenuDao;
    @Override
    public List<Menu> queryMenu(  String id) {
        List<Menu> list =queryMenuDao.queryMenu(id);
        return list;
    }
}
