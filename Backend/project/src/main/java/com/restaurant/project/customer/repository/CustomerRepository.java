package com.restaurant.project.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurant.project.customer.entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{

	Customer findByCustomerEmailAndCustomerPassword(String tempCustomerEmail, String tempCustomerPassword);
	Customer findByCustomerEmail(String email);
}
