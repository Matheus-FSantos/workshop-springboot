package io.github.MatheusFSantos.Repositories;

import io.github.MatheusFSantos.Entities.OrderItem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {}