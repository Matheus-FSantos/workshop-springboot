package io.github.MatheusFSantos.Repositories;

import io.github.MatheusFSantos.Entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>{
}