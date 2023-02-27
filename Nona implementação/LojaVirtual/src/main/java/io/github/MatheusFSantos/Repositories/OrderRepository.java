package io.github.MatheusFSantos.Repositories;

import io.github.MatheusFSantos.Entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>{}