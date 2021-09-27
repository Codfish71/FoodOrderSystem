package com.restaurant.project.admin.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "admin")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int admin_id;
	private String adminName;
	private String adminEmail;
	private String adminPassword;
	
	
	

	public Admin(int admin_id, String admin_name, String admin_email, String admin_password) {
		super();
		this.admin_id = admin_id;
		this.adminName = admin_name;
		this.adminEmail = admin_email;
		this.adminPassword = admin_password;
	}

	public Admin() {
		super();
	}

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public String getAdmin_name() {
		return adminName;
	}

	public void setAdmin_name(String admin_name) {
		this.adminName = admin_name;
	}

	public String getAdmin_email() {
		return adminEmail;
	}

	public void setAdmin_email(String admin_email) {
		this.adminEmail = admin_email;
	}

	public String getAdmin_password() {
		return adminPassword;
	}

	public void setAdmin_password(String admin_password) {
		this.adminPassword = admin_password;
	}

	@Override
	public String toString() {
		return "Admin [admin_id=" + admin_id + ", admin_name=" + adminName + ", admin_email=" + adminEmail
				+ ", admin_password=" + adminPassword + "]";
	}

}
