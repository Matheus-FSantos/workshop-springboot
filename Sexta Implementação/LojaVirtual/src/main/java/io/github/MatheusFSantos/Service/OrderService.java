package io.github.MatheusFSantos.Service;

import io.github.MatheusFSantos.Entities.Order;
import io.github.MatheusFSantos.Repositories.OrderRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;

	public List<Order> findAll() {
		return orderRepository.findAll();
	}
	
	public Order findById(Long id){
		Optional<Order> order= orderRepository.findById(id);
		return order.get();
	}
}