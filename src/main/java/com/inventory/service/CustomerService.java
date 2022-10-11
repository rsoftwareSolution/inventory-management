package com.inventory.service;

import com.inventory.entity.CustomerDetails;

public interface CustomerService {

    /**
     * This method will use to get the list of all customers.
     */
    Iterable<CustomerDetails> findAll();

    CustomerDetails saveCustomer(CustomerDetails customer);

}
