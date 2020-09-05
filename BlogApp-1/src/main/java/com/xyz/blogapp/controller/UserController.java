package com.xyz.blogapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.blogapp.model.User;
import com.xyz.blogapp.service.UserService;

@RestController
public class UserController {
	
//	@RequestMapping("/testUser")
//	public String test() {
//		return "test Useer";
//	}
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/users/add")
	private  void addUser(@RequestBody User user){
		userService.addUser(user);
	}
	
	@GetMapping("/users/{userId}/get")
	private  User getUser(@PathVariable("userId") int userId){
		System.out.println("inside");
		return userService.getUserById(userId);
	}
	
	@GetMapping("/users/get")
	private  List<User> getUser(){
		System.out.println("inside");
		return userService.getUsers();
	}
	
	@PutMapping("/users/{userId}/update")
	public void updateUser(@RequestBody User user, @PathVariable("userId") int userId) {
		userService.updateUser(user);
	}
	
	@DeleteMapping("/users/{userId}/delete")
	public void deleteUser( @PathVariable("userId") int userId) {
		userService.deleteUser(userId);
	}

}
