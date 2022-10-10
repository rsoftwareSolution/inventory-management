package com.inventory.service;

import com.inventory.entity.Customer;

public interface CustomerService {

    Iterable<Customer> findAll();

    Customer saveCustomer(Customer customer);

}
