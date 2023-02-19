package io.github.MatheusFSantos.Resources;

import java.util.ArrayList;
import java.util.List;

import io.github.MatheusFSantos.Entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping("/findAll")
	public ResponseEntity<List<User>> findAll() {
		List<User> users = new ArrayList<User>();
		
		users.add(new User(1L, "Matheus", "matheus@gmail.com", "965819026", "ddd"));
		users.add(new User(2L, "Teste", "teste@gmail.com", "940028922", "sss"));
		
		return ResponseEntity.ok().body(users);
	}
}