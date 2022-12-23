package com.example.lesson03.dao;

import org.springframework.stereotype.Repository;

import com.example.lesson03.model.Review;

@Repository
public interface ReviewDAO {
	
	public Review selectReview(int id); // 파라미터가 한개면 @Param("id") 어노테이션을 안써도 된다.
	
}
