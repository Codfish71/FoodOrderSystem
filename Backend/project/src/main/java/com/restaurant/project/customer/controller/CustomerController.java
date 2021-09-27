package com.restaurant.project.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.project.customer.entity.Customer;
import com.restaurant.project.customer.service.CustomerService;
import com.restaurant.project.food.entity.Food;
import com.restaurant.project.menu.entity.Menu;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@PostMapping("/customer/register")
	public String registerCustomer(@RequestBody Customer customer) {
		customerService.registerCustomer(customer);
		return "Hey " + customer.getCustomer_name() + "You have successfully registered";
	}
	
	@PostMapping("/customer/login")
	public Customer loginCustomer(@RequestBody Customer customer) throws Exception {
		Customer customerFromDb = null;
		String tempCustomerEmail = customer.getCustomer_email();
		String tempCustomerPassword = customer.getCustomer_password();
		if(tempCustomerEmail!= null && tempCustomerPassword !=null) {
			customerFromDb = customerService.findCustomerByEmailAndPassword(tempCustomerEmail,tempCustomerPassword);
		}
		if(customerFromDb == null) {
			throw new Exception("Bad Credentials");
		}
		return customerFromDb;
	}
	@GetMapping("customer/{id}")
	public Customer getCustomerById(@PathVariable("id") int id) {
		return customerService.getCustomerById(id);
	}
	@GetMapping("customer/profile/{email}")
	public Customer getCustomerByEmail(@PathVariable("email") String email) {
		return customerService.getCustomerById(email);
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
