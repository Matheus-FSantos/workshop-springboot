package io.github.MatheusFSantos.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import io.github.MatheusFSantos.Entities.OrderItem;
import io.github.MatheusFSantos.Repositories.OrderItemRepository;

@Service
public class OrderItemService {
	
	@Autowired
	private OrderItemRepository orderItemRepository;
	
	public List<OrderItem> findAll(){
		return orderItemRepository.findAll();
	}
	
	public OrderItem findById(Long id) {
		Optional<OrderItem> orderItem = orderItemRepository.findById(id);
		return orderItem.get();
	}
}