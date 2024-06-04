package com.yakub.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Qualifier;

@Entity
@Table(name="USER_TBL")                  //Registration 
public class Users {

  @Id
  private Integer id;
 private String username;
 private String email;
 private String password;
public Users() {
	super();
}
public Users(Integer id, String username, String email, String password) {
	super();
	this.id = id;
	this.username = username;
	this.email = email;
	this.password = password;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "User [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password + "]";
}
 
 


}
