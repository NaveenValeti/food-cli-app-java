package com.naveen.foodcliapp.repository;

import com.naveen.foodcliapp.model.Customer;
import com.naveen.foodcliapp.util.CsvReader;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;

public class CustomerRepository {
    private List<Customer> customerList;

    public CustomerRepository() throws FileNotFoundException {
        CsvReader csvReader=new CsvReader();
        this.customerList = csvReader.readCustomersFromCsv();
    }

    public List<Customer>getCustomerList(){
        return this.customerList;
    }

    public Customer save(Customer customer){
        this.customerList.add(customer);
        return customer;
    }

    public Optional<Customer>findCustomerByid(String id){
        return this.customerList.stream().filter(customer -> customer.getCustomerId().equals(id).findFirst());
    }
}
