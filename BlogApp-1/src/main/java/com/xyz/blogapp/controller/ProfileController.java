package com.xyz.blogapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.blogapp.model.Profile;
import com.xyz.blogapp.model.User;
import com.xyz.blogapp.service.ProfileSerice;
import com.xyz.blogapp.service.UserService;

@RestController
public class ProfileController {
//	@RequestMapping("/test")
//	public String test() {
//		return "test";
//	}
	@Autowired
	private ProfileSerice profileService;
	
	
	@PostMapping("/users/{userId}/profiles/add")
	private  void addProfile(@RequestBody Profile profile,@PathVariable("userId") int userId){
		 profileService.addProfile(profile,userId);
	}
	
	@GetMapping("/users/{userId}/profiles/{profileId}/get")
	private  Profile getProfile(@PathVariable("userId") int userId,@PathVariable("profileId") int profileId){
		 return profileService.getProfile(profileId);
	}
	
	@DeleteMapping("/users/{userId}/profiles/{profileId}/delete")
	private  void deleteProfile(@PathVariable("userId") int userId,@PathVariable("profileId") int profileId){
		  profileService.deleteProfile(profileId);
	}
	
	
    
}
