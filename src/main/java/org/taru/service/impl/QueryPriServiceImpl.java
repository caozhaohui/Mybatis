package org.taru.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.taru.dao.QueryPrivelageDao;
import org.taru.service.QueryPriService;

import java.util.List;

@Service
public class QueryPriServiceImpl implements QueryPriService {

    @Autowired
    QueryPrivelageDao impl;

    public List queryPriservice(String userId) {
      List list = impl.PrivswihtUser(userId);
        return list;
    }
}
