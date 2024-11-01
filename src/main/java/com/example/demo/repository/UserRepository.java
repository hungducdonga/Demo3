package com.example.demo.repository;

import com.example.demo.model.UserDemo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<UserDemo, Integer>
{
    List<UserDemo> findAll();
}
