package com.restaurant.project.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.project.admin.entity.Admin;
import com.restaurant.project.admin.service.AdminService;
import com.restaurant.project.food.entity.Food;
import com.restaurant.project.menu.entity.Menu;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class AdminController {
	@Autowired
	private AdminService adminService;

	@PostMapping("/admin/register")
	public String saveAdmin(@RequestBody Admin admin) throws Exception {
		String tempEmail = admin.getAdmin_email();

		if (tempEmail != null && !"".equals(tempEmail)) {
			Admin adminObjectFromDb = adminService.findAdminByEmail(tempEmail);
			if (adminObjectFromDb != null) {
				throw new Exception("Admin with the same email already exist!");
			}
		}
		adminService.saveAdmin(admin);
		return "Hi" + admin.getAdmin_name() + "You have successfully registered";
	}

	@PostMapping("/admin/login")
	public Admin loginAdmin(@RequestBody Admin admin) throws Exception {
		Admin adminFromDb = null;
		String tempAdminEmail = admin.getAdmin_email();
		String tempAdminPassword = admin.getAdmin_password();
		if (tempAdminEmail != null && tempAdminPassword != null) {
			adminFromDb = adminService.findAdminByEmailAndPassword(tempAdminEmail, tempAdminPassword);
		}
		if(adminFromDb == null) {
			throw new Exception("Bad Credentials");
		}
		return adminFromDb;
	}

	@GetMapping("/admin/menus")
	public List<Menu> getAllMenus() {
		return adminService.getAllMenus();
	}
	
	
	@DeleteMapping("/admin/menus/{id}")
	public List<Menu> deleteMenu(@PathVariable("id") int id) {
		return adminService.deleteMenu(id);
	}

	@PostMapping("admin/menus")
	public String addMenu(@RequestBody Menu menu) {
		adminService.addMenu(menu);
		return "Menu" + menu.getMenu_name() + "Added successfully";
	}

	@PostMapping("admin/foodItems")
	public String addFoodItem(@RequestBody Food foodItem) {
		adminService.addFoodItem(foodItem);
		return "Hi admin Food Item " + foodItem.getFood_name() + " Has been addded";
	}

	@GetMapping("admin/foodItems")
	public List<Food> getAllFoodItems() {
		return adminService.getAllFoodItems();
	}

	@DeleteMapping("admin/foodItems/{id}")
	public String deleteFoodItemById(@PathVariable("id") int id ) {
		adminService.deleteFoodItem(id);
		return "Item deleted successfully";
	}
	
	@GetMapping("admin/foodItems/{category}")
	public List<Food> getFoodItemsByCategory(@PathVariable("category") String category) {
		return adminService.getFoodItemsByCategory(category);
	}
}