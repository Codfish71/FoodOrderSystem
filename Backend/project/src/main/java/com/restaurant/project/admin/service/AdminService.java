package com.restaurant.project.admin.service;

import java.util.List;

import com.restaurant.project.admin.entity.Admin;
import com.restaurant.project.food.entity.Food;
import com.restaurant.project.menu.entity.Menu;

public interface AdminService {

	public void saveAdmin(Admin admin);

	public List<Menu> getAllMenus();

	public List<Menu> deleteMenu(int id);

	public void addMenu(Menu menu);

	public void addFoodItem(Food foodItem);

	public List<Food> getAllFoodItems();
	
	public Admin findAdminByEmail(String email);
	
	public Admin findAdminByEmailAndPassword(String email, String password);

	public void deleteFoodItem(int id);

	public List<Food> getFoodItemsByCategory(String category);

}
