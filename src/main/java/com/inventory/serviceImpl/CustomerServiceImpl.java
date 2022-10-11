package com.inventory.serviceImpl;

import com.inventory.entity.CustomerDetails;
import com.inventory.repository.CustomerRepository;
import com.inventory.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private static final Logger Log = LoggerFactory.getLogger(CustomerServiceImpl.class);

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Iterable<CustomerDetails> findAll() {
        Log.info("Showing list of customers");
        return customerRepository.findAll();
    }

    @Override
    public CustomerDetails saveCustomer(CustomerDetails customer) {
        Log.info("Save Successfully customer for customer id - {}");
        return customerRepository.save(customer);
    }
}
