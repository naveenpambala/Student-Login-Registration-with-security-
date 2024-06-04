package com.yakub.security;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.yakub.models.Users;
import com.yakub.repo.UsersRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
		return new User("admin", "admin", new ArrayList<>());
	}
	
//	@Autowired
//	private UsersRepository repository;
//
//	@Override
//	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//		Users user = repository.findByEmail(email);
//
//		return new User(user.getEmail(), user.getPassword(), new ArrayList<>());
//	}
}