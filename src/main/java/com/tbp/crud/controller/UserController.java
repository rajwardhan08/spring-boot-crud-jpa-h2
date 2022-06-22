package com.tbp.crud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tbp.crud.dao.Service.UserService;
import com.tbp.crud.entity.User;
import com.tbp.crud.entity.UserRepository;

@RestController
public class UserController
{ 
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserService userService;
	private Object service;
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user)
	{
		return userService.createUser(user);
	}
	@PostMapping("/addUsers")           
	public List<User> addUsers(@RequestBody List<User> users)
	{
		return userService.createUsers(users);
	}
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable int id)
	{
		return userService.getUserById(id);
	}
	@GetMapping("/user")
	public List<User> getAllUsers()
	{
		return userService.getUser();
	}
	@PutMapping("/updateuser")
	public User updateUser(@RequestBody User use)
	{
		return userService.updateUser(use);
	}
	@DeleteMapping("/user/{id}")
	public String deleteuser(@PathVariable int id)
	{
		return userService.deleteUserById(id);
	}
}
