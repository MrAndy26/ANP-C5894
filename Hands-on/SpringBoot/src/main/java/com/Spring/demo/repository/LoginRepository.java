package com.Spring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.demo.entity.Login;

public interface LoginRepository extends JpaRepository<Login, Integer>
{
    Login findByUserNameAndPassword(String userName, String password);
}

