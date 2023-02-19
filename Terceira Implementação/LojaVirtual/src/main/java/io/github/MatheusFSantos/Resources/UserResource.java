package io.github.MatheusFSantos.Resources;

import java.util.List;

import io.github.MatheusFSantos.Entities.User;
import io.github.MatheusFSantos.Repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/findAll")
	public ResponseEntity<List<User>> findAll() {
		return ResponseEntity.ok().body(userRepository.findAll());
	}
}