package io.github.MatheusFSantos.Configurations;

import java.util.Arrays;

import java.time.Instant;

import io.github.MatheusFSantos.Entities.User;
import io.github.MatheusFSantos.Entities.Order;
import io.github.MatheusFSantos.Entities.Product;
import io.github.MatheusFSantos.Entities.Category;
import io.github.MatheusFSantos.Entities.OrderStatus;

import io.github.MatheusFSantos.Repositories.UserRepository;
import io.github.MatheusFSantos.Repositories.OrderRepository;
import io.github.MatheusFSantos.Repositories.ProductRepository;
import io.github.MatheusFSantos.Repositories.CategoryRepository;

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
	
	@Autowired
	private ProductRepository productRepository; 
	
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
		Category category4 = new Category(null, "Eletronics");
		Category category5 = new Category(null, "Computers");
		Category category6 = new Category(null, "Books");
		
		Product product1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product product2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product product3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product product4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Product product5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
		
		userRepository.saveAll(Arrays.asList(user1, user2));
		orderRepository.saveAll(Arrays.asList(order1, order2, order3));
		categoryRepository.saveAll(Arrays.asList(category1, category2, category3, category4, category5, category6));
		productRepository.saveAll(Arrays.asList(product1, product2, product3, product4, product5));
		
		//Relacionamento
		product1.getCategories().add(category6);
		product2.getCategories().add(category4);
		product3.getCategories().addAll(Arrays.asList(category4, category5));
		product4.getCategories().addAll(Arrays.asList(category3, category4, category5));
		product5.getCategories().add(category6);
		
		productRepository.saveAll(Arrays.asList(product1, product2, product3, product4, product5));
	}
}