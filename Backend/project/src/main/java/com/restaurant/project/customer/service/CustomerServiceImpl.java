package com.restaurant.project.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.project.customer.entity.Customer;
import com.restaurant.project.customer.repository.CustomerRepository;
import com.restaurant.project.food.entity.Food;
import com.restaurant.project.food.repository.FoodRepository;
import com.restaurant.project.menu.entity.Menu;
import com.restaurant.project.menu.repository.MenuRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private MenuRepository menuRepository;
	
	@Autowired
	private FoodRepository foodRepository;
	
	@Override
	public void registerCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
	}
	@Override
	public List<Menu> getAllMenus() {
		// TODO Auto-generated method stub
		return menuRepository.findAll();
	}
	@Override
	public List<Food> getAllFoodItems() {
		// TODO Auto-generated method stub
		return foodRepository.findAll();
	}
	

}
