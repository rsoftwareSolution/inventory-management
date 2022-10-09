package com.inventory.controller;

import com.inventory.entity.Customer;
import com.inventory.serviceImpl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerServiceImpl customerService;
    @GetMapping(value = "/getAll")
    private Iterable<Customer> getCustomer() {
        return customerService.findAll();
    }

    @PostMapping("/save")
    private ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {
        Customer createdCustomer = customerService.saveCustomer(customer);
        return ResponseEntity.ok().body(createdCustomer);
    }
}
