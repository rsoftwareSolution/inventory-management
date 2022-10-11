package com.inventory.controller;

import com.inventory.entity.CustomerDetails;
import com.inventory.serviceImpl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerServiceImpl customerService;

    @GetMapping(value = "/getAll")
    private Iterable<CustomerDetails> getCustomer() {
        return customerService.findAll();
    }

}
