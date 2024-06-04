package com.yakub.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yakub.models.Users;

public interface UsersRepository  extends JpaRepository<Users, Integer> {

	Users findByEmail(String email);

}
