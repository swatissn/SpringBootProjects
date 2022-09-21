package com.validation.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.validation.model.User;
import com.validation.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping
	public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
		User savedUser = userService.createUser(user);
		return new ResponseEntity<User>(savedUser, HttpStatus.CREATED);

	}

	@PutMapping
	public ResponseEntity<User> updateUser(@Valid @RequestBody User user) {
		User savedUser = userService.createUser(user);
		return new ResponseEntity<User>(savedUser, HttpStatus.CREATED);

	}

	// http://localhost:8082/user
	/*
	 * @PostMapping public ResponseEntity<User> createAllUsers(@Valid @RequestBody
	 * List<User> user){ User savedUser= (User) userService.createAllUsers(user);
	 * return new ResponseEntity<User>(savedUser,HttpStatus.CREATED); }
	 * 
	 * //http://localhost:8082/user
	 * 
	 * @PutMapping public ResponseEntity<User> updateAllUsers(@Valid @RequestBody
	 * List<User> user){ User savedUser= (User) userService.updateAllUsers(user);
	 * return new ResponseEntity<User>(savedUser,HttpStatus.CREATED); }
	 */

}
