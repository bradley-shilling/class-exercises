package com.techelevator.validation.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class Login {
	
	@NotBlank(message="field is blank")
	@Size(max=20, message="too large limit to 20 characters")
	private String email;
	
	@NotEmpty(message="field is blank")
	@Size(min=8, message="must be at least 8 characters long")
	@Pattern(regexp="[%&*\\()$#@!]+", message="must contain at least one special character") // have 1 0r more special char
	private String password;
	
	
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
}


