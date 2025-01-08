package com.nontech.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nontech.blog.entities.Category;


public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
