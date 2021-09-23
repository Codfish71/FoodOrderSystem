package com.restaurant.project.customer.service;

import java.util.List;

import com.restaurant.project.customer.entity.Customer;
import com.restaurant.project.food.entity.Food;
import com.restaurant.project.menu.entity.Menu;

public interface CustomerService {

	public void registerCustomer(Customer customer);

	public List<Menu> getAllMenus();

	public List<Food> getAllFoodItems();
		
}
