package io.github.MatheusFSantos.Resources;

import java.util.List;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;

import io.github.MatheusFSantos.Entities.OrderItem;
import io.github.MatheusFSantos.Services.OrderItemService;

@RestController
@RequestMapping("/orderItems")
public class OrderItemResource {

	@Autowired
	private OrderItemService orderItemService;
	
	@GetMapping
	public ResponseEntity<List<OrderItem>> findAll(){
		return ResponseEntity.ok().body(orderItemService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<OrderItem> findById(@PathVariable Long id){
		return ResponseEntity.ok().body(orderItemService.findById(id));
	}
}