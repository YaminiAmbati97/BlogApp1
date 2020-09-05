package com.xyz.blogapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyz.blogapp.model.Profile;
import com.xyz.blogapp.model.User;
import com.xyz.blogapp.repository.ProfileRepository;
import com.xyz.blogapp.repository.UserRepository;

@Service
public class ProfileSerice {
	@Autowired
	private ProfileRepository profileRepository;
	@Autowired
	private UserRepository userRepository;

	public void addProfile(Profile profile, int userId) {
		//set parent ref in child
		User user=userRepository.findById(userId).get();
		
		profile.setUser(user);
		//set child ref in parent..updating child with parent
		user.setProfile(profile);  
	
		//
		profileRepository.save(profile);
	}

	public Profile getProfile(int profileId) {
		return profileRepository.findById(profileId).get();
	}

	public void deleteProfile(int profileId) {
		profileRepository.deleteById(profileId);
		
	}

}
