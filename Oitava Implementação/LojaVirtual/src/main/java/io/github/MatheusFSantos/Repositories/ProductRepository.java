package io.github.MatheusFSantos.Repositories;

import io.github.MatheusFSantos.Entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
