package com.naveen.foodcliapp.service;

import com.naveen.foodcliapp.exception.CustomerExistsException;
import com.naveen.foodcliapp.model.Customer;
import com.naveen.foodcliapp.repository.CustomerRepository;

import java.util.Optional;

public class CustomerServiceImpl implements CustomerService {
    @Override

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer save(Customer customer) throws CustomerExistsException {

        //if customer already exists(id, name,email,) then trhow CustomerExistsException
        //else save the customer in the repository

        Optional<Customer> customerByid = this.customerRepository.findCustomerByid(customer.getcustomerId());
        if(customerByid.isPresent())
            throw new CustomerExistsException(("Customer already exists with this id : "+customer.getCustomerId());

        return this.customerRepository.save(customer);
    }
}
