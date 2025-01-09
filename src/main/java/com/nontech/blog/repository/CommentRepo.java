package com.nontech.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nontech.blog.entities.Comment;


public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
