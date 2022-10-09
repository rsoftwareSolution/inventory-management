package com.inventory.service;

import com.inventory.entity.Customer;
import com.inventory.model.CustomerModel;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    Iterable<Customer> findAll();

    Customer saveCustomer(Customer customer);

}
