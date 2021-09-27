package com.restaurant.project.customer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customer_id;
	
	private String customerName;
	private String customerEmail;
	private String customerPassword;
	private String customerAddress;
	public Customer(int customer_id, String customer_name, String customer_email, String customer_password,
			String customer_address) {
		super();
		this.customer_id = customer_id;
		this.customerName = customer_name;
		this.customerEmail = customer_email;
		this.customerPassword = customer_password;
		this.customerAddress = customer_address;
	}
	public Customer() {
		super();
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customerName;
	}
	public void setCustomer_name(String customer_name) {
		this.customerName = customer_name;
	}
	public String getCustomer_email() {
		return customerEmail;
	}
	public void setCustomer_email(String customer_email) {
		this.customerEmail = customer_email;
	}
	public String getCustomer_password() {
		return customerPassword;
	}
	public void setCustomer_password(String customer_password) {
		this.customerPassword = customer_password;
	}
	public String getCustomer_address() {
		return customerAddress;
	}
	public void setCustomer_address(String customer_address) {
		this.customerAddress = customer_address;
	}
	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customer_name=" + customerName + ", customer_email="
				+ customerEmail + ", customer_password=" + customerPassword + ", customer_address=" + customerAddress
				+ "]";
	}
	
	
	
}
