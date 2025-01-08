package com.nontech.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nontech.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
