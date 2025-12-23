package com.som.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.som.project.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
