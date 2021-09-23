package com.restaurant.project.food.entity;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "food")
public class Food {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int food_id;
	private String food_name;
	private String food_description;

	public Food(int food_id, String food_name, String food_description) {
		super();
		this.food_id = food_id;
		this.food_name = food_name;
		this.food_description = food_description;
		
	}

	public Food() {
		super();
	}

	public int getFood_id() {
		return food_id;
	}

	public void setFood_id(int food_id) {
		this.food_id = food_id;
	}

	public String getFood_name() {
		return food_name;
	}

	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}

	public String getFood_description() {
		return food_description;
	}

	public void setFood_description(String food_description) {
		this.food_description = food_description;
	}

	

	@Override
	public String toString() {
		return "Food [food_id=" + food_id + ", food_name=" + food_name + ", food_description=" + food_description
				+  "]";
	}
	

}
