package com.restaurant.project.admin.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurant.project.admin.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {

	Admin findByAdminEmail(String email);
	Admin findByAdminEmailAndAdminPassword(String email,String password);
	
}
