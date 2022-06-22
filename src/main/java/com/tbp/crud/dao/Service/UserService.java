package com.tbp.crud.dao.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Service;

import com.tbp.crud.entity.User;
import com.tbp.crud.entity.UserRepository;

@Service
public class UserService
{
	@Autowired
	private UserRepository userRepository;
	
	public User createUser(User user)
	{
		return userRepository.save(user);
	}
	
	public List<User> createUsers(List<User> users)
	{
		return userRepository.saveAll(users);
	}
	public User getUserById(int id)
	{
		return userRepository.findById(id).orElse(null);
	}
	public List<User> getUser()
	{
		return userRepository.findAll();
	}
	public User updateUser(User user)
	{
		User oldUser=null;
		Optional<User> OptionalUser =userRepository.findById(user.getId());
		if( OptionalUser.isPresent())
		{
			oldUser= OptionalUser.get();
			oldUser.setName(user.getName());
			oldUser.setAddress(user.getAddress());
			userRepository.save(oldUser);	
		}
		else
		{
			return new User();
		}
		return oldUser;
	}
	public String deleteUserById(int id)
	{
		userRepository.deleteById(id);
		return "Finally user got deleted";
	}
}
