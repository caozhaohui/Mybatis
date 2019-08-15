package org.taru.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.taru.dao.CustomerDao;
import org.taru.domel.Customer;
import org.taru.service.CustomerService;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerDao customerDao;
    @Override
    public List<Customer> querycustomer() {
        List<Customer> list= customerDao.querycustomer();
       return list;
    }
}
