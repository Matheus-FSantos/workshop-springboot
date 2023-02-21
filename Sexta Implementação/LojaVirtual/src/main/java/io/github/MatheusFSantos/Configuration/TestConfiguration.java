package io.github.MatheusFSantos.Configuration;

import java.time.Instant;
import java.util.Arrays;

import io.github.MatheusFSantos.Entities.Category;
import io.github.MatheusFSantos.Entities.Order;
import io.github.MatheusFSantos.Entities.OrderStatus;
import io.github.MatheusFSantos.Entities.User;
import io.github.MatheusFSantos.Repositories.CategoryRepository;
import io.github.MatheusFSantos.Repositories.OrderRepository;
import io.github.MatheusFSantos.Repositories.UserRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import org.springframework.beans.factory.annotation.Autowired;


@Configuration
public class TestConfiguration implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User user1 = new User(null, "Matheus", "matheus@gmail.com", "965819026", "ddd");
		User user2 = new User(null, "TesteSP", "teste@gmail.com", "985658556", "teste123");
		
		/*  Instant.parse("ano-mes-diaThora:minuto:segundosZ") -> Padrão UTC  */
		Order order1 = new Order(null, user1, Instant.parse("2023-02-19T16:13:07Z"), OrderStatus.PAID);
		Order order2 = new Order(null, user2, Instant.parse("2023-02-19T16:13:17Z"), OrderStatus.WAITING_PAYMENT);
		Order order3 = new Order(null, user1, Instant.parse("2023-02-19T16:13:27Z"), OrderStatus.DELIVERED);
		
		Category category1 = new Category(null, "Toys");
		Category category2 = new Category(null, "Clothing");
		Category category3 = new Category(null, "Games");
		
		userRepository.saveAll(Arrays.asList(user1, user2));
		orderRepository.saveAll(Arrays.asList(order1, order2, order3));
		categoryRepository.saveAll(Arrays.asList(category1, category2, category3));
	}
}