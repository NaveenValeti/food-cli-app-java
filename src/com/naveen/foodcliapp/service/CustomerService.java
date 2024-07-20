package com.naveen.foodcliapp.service;

import com.naveen.foodcliapp.exception.CustomerExistsException;
import com.naveen.foodcliapp.model.Customer;

public interface CustomerService {

    public Customer save(Customer customer) throws CustomerExistsException;
}