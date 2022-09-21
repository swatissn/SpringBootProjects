package com.validation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.validation.model.User;
import com.validation.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User createUser(User user) {
		return userRepository.save(user);
	}

	public User updateUser(User user) {
		return userRepository.save(user);
	}

	public List<User> createAllUsers(List<User> users) {
		return userRepository.saveAll(users);
	}
	
	public List<User> updateAllUsers(List<User> users) {
		return userRepository.saveAll(users);
	}
}
