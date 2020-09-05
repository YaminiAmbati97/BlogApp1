package com.xyz.blogapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyz.blogapp.model.User;
import com.xyz.blogapp.repository.UserRepository;


@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public void addUser(User user) {
		userRepository.save(user);
	}

	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		System.out.println("inside");
		return userRepository.findById(userId).get();
	}

	public List<User> getUsers() {
		List<User> users = new ArrayList<User>();
		userRepository.findAll().forEach(users::add);
	    return users;
	}
	
	public void updateUser(User user) {
		userRepository.save(user);
	}

	public void deleteUser(int userId) {
		userRepository.deleteById(userId);;
		
	}
	
	
	

}
