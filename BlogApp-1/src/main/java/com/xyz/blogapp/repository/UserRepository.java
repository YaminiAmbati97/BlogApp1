package com.xyz.blogapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xyz.blogapp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
