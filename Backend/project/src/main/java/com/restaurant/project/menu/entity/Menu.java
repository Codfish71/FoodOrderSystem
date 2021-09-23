package com.restaurant.project.menu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="menu")
public class Menu {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int menu_id;
	private String menu_name;
	private String menu_description;
	
	
	public Menu(int menu_id, String menu_name, String menu_description, int menu_price) {
		super();
		this.menu_id = menu_id;
		this.menu_name = menu_name;
		this.menu_description = menu_description;
		
	}
	public Menu() {
		super();
	}
	public int getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}
	public String getMenu_name() {
		return menu_name;
	}
	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}
	public String getMenu_description() {
		return menu_description;
	}
	public void setMenu_description(String menu_description) {
		this.menu_description = menu_description;
	}
	
	@Override
	public String toString() {
		return "Menu [menu_id=" + menu_id + ", menu_name=" + menu_name + ", menu_description=" + menu_description
				+   "]";
	}
	
	
	
	}
