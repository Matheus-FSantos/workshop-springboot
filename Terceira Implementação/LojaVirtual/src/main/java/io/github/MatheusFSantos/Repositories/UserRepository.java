package io.github.MatheusFSantos.Repositories;

import io.github.MatheusFSantos.Entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
}