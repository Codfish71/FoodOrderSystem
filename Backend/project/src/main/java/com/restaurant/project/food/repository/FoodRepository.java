package com.restaurant.project.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurant.project.food.entity.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Integer> {

}
