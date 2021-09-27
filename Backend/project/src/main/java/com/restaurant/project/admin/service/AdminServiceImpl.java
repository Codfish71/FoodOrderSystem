package com.restaurant.project.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.project.admin.entity.Admin;
import com.restaurant.project.admin.repository.AdminRepository;
import com.restaurant.project.food.entity.Food;
import com.restaurant.project.food.repository.FoodRepository;
import com.restaurant.project.menu.entity.Menu;
import com.restaurant.project.menu.repository.MenuRepository;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminRepository adminRepository;
	@Autowired
	private MenuRepository menuRepository;
	
	@Autowired
	private FoodRepository foodRepository;
	@Override
	public void saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adminRepository.save(admin);
	}
	@Override
	public List<Menu> getAllMenus() {
		// TODO Auto-generated method stub
		return menuRepository.findAll();
	}
	@Override
	public List<Menu> deleteMenu(int id) {
		// TODO Auto-generated method stub
		menuRepository.deleteById(id);
		return menuRepository.findAll();
	}
	@Override
	public void addMenu(Menu menu) {
		// TODO Auto-generated method stub
		menuRepository.save(menu);
	}
	@Override
	public void addFoodItem(Food foodItem) {
		// TODO Auto-generated method stub
		foodRepository.save(foodItem);
	}
	@Override
	public List<Food> getAllFoodItems() {
		// TODO Auto-generated method stub
		return foodRepository.findAll();
	}
	@Override
	public Admin findAdminByEmail(String email) {
		return adminRepository.findByAdminEmail(email);
	}
	@Override
	public Admin findAdminByEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		return adminRepository.findByAdminEmailAndAdminPassword(email, password);
	}
	@Override
	public void deleteFoodItem(int id) {
		foodRepository.deleteById(id);
	}
	@Override
	public List<Food> getFoodItemsByCategory(String category) {
		// TODO Auto-generated method stub
		return foodRepository.findByCategory(category);
	}

}
