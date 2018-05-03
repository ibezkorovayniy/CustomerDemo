package com.Illia.customerdemo.service;

import com.Illia.customerdemo.dao.CustomerDao;
import com.Illia.customerdemo.model.Customer;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerDao customerDao;


    @Override
    public Customer getById(Long id) {
        System.out.println("In CustomerServiceImpl getById: " + id);
        return customerDao.getOne(id);
    }

    @Override
    public void save(Customer customer) {
        System.out.println("In CustomerServiceImpl save customer: " + customer);
        customerDao.save(customer);

    }

    @Override
    public void delete(Long id) {
        System.out.println("In CustomerServiceImpl deleteById: " + id);
        customerDao.deleteById(id);
    }

    @Override
    public List<Customer> getAll() {
        System.out.println("In CustomerServiceImpl getAll");
        return customerDao.findAll();
    }
}
