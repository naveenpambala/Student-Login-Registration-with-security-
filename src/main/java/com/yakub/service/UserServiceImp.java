package com.yakub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.yakub.models.AuthenticationRequest;
import com.yakub.models.AuthenticationResponse;
import com.yakub.models.Users;
import com.yakub.repo.UsersRepository;
import com.yakub.security.MyUserDetailsService;
import com.yakub.util.JwtUtil;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	 private JwtUtil jwUtil;
	
	@Autowired
	private AuthenticationManager authenicationManager;
	
	 @Autowired
	private UsersRepository repo;
	 
		@Autowired
		private MyUserDetailsService userDetailsService;

	@Override
	public Users signUp(Users id) {
		
		return  repo.save(id);
	  
	}
	 
	@Override
	public AuthenticationResponse signIn(AuthenticationRequest loginModel) {
		authenicationManager
				.authenticate(new UsernamePasswordAuthenticationToken(loginModel.getEmail(), loginModel.getPassword()));
		final UserDetails userDetails = userDetailsService.loadUserByUsername(loginModel.getEmail());
		final String token = jwUtil.generateToken(userDetails);
		return new AuthenticationResponse(token);
	}
 
	}
		 
		 

		
	
	

