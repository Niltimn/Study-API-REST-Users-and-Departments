package com.myproject.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
