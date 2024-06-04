package com.yakub.service;



import com.yakub.models.AuthenticationRequest;
import com.yakub.models.AuthenticationResponse;
import com.yakub.models.Users;
public interface UserService { 
	
 public Users signUp(Users user);
 
 public AuthenticationResponse signIn(AuthenticationRequest loginModel);
 
}