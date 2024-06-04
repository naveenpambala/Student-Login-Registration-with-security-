package com.yakub.rest;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yakub.models.AuthenticationRequest;
import com.yakub.models.AuthenticationResponse;
import com.yakub.models.Users;
import com.yakub.service.UserService; 
//@CrossOrigin(origins = "http://localhost:4200/") 
@RestController 
@RequestMapping("/api/security") 
public class UserController { 
 
 @Autowired 
 private UserService service; 
  
 @PostMapping("/signUp") 
 public ResponseEntity<String> signUp(@RequestBody Users user){ 
	 service.signUp(user);
   return new ResponseEntity<String>("user register successfully",HttpStatus.CREATED); 
 } 
  
 @PostMapping("/signIn") 
 public ResponseEntity<AuthenticationResponse> signIn( @RequestBody AuthenticationRequest loginModel){ 
   
  return new ResponseEntity(service.signIn(loginModel),HttpStatus.ACCEPTED); 
 } 
  
}
