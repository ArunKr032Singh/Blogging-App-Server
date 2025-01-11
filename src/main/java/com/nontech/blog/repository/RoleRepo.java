package com.nontech.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nontech.blog.entities.Role;


public interface RoleRepo  extends JpaRepository<Role, Integer>{

}
