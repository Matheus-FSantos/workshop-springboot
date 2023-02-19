package io.github.MatheusFSantos.Configuration;

import java.util.Arrays;

import io.github.MatheusFSantos.Entities.User;
import io.github.MatheusFSantos.Repositories.UserRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Configuration;

import org.springframework.beans.factory.annotation.Autowired;


@Configuration
public class TestConfiguration implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User(null, "Matheus", "matheus@gmail.com", "965819026", "ddd");
		User user2 = new User(null, "TesteSP", "teste@gmail.com", "985658556", "teste123");
		
		userRepository.saveAll(Arrays.asList(user1, user2));
	}
}