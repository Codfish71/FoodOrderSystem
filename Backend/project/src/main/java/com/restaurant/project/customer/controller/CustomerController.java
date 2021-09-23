package com.restaurant.project.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.project.customer.entity.Customer;
import com.restaurant.project.customer.service.CustomerService;
import com.restaurant.project.food.entity.Food;
import com.restaurant.project.menu.entity.Menu;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@PostMapping("/customer")
	public String registerCustomer(@RequestBody Customer customer) {
		customerService.registerCustomer(customer);
		return "Hey " + customer.getCustomer_name() + "You have successfully registered";
	}
	
	@GetMapping("customer/menus")
	public List<Menu> getAllMenus(){
		return customerService.getAllMenus();
	}
	
	@GetMapping("customer/foodItems")
	public List<Food> getAllFoodItems() {
		return customerService.getAllFoodItems();
	}
}
