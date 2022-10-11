package com.inventory.repository;

import com.inventory.entity.CustomerDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerDetails, Long> {

    @Override
    Iterable<CustomerDetails> findAll();
}

