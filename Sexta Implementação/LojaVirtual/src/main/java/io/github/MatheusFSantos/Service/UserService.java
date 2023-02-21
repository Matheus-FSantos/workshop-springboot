package io.github.MatheusFSantos.Service;

import java.util.List;
import java.util.Optional;

import io.github.MatheusFSantos.Entities.User;
import io.github.MatheusFSantos.Repositories.UserRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> user = userRepository.findById(id);
		return user.get();
	}
}