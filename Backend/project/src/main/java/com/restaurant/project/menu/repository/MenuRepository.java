package com.restaurant.project.menu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurant.project.menu.entity.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu,Integer>{

}
