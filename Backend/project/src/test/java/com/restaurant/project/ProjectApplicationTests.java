package com.restaurant.project;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.restaurant.project.admin.entity.Admin;
import com.restaurant.project.admin.repository.AdminRepository;

@SpringBootTest
class ProjectApplicationTests {
	
	@Autowired
	AdminRepository adminRepository;

	@Test
	public void createAdmin() {
		Admin admin = new Admin(55,"PRathamTest","abcd@gmail.com","abcd@1234");
		 
		adminRepository.save(admin);
		assertNotNull(adminRepository.findByAdminEmail("abcd@gmail.com"));
	}
	
	public void getMenu() {
		
	}
	
}
