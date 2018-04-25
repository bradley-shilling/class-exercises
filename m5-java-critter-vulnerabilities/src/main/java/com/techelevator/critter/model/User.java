package com.techelevator.critter.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class User {
	@NotBlank
	private String userName;
	
	@NotBlank
	@Size(min=12, message="Password must be at least 12 characters")
	@Pattern.List({
		@Pattern(regexp=".*[a-z].*", message="Must have a lower case letter"),
		@Pattern(regexp=".*[A-Z].*", message="Must have an upper case letter"),
		@Pattern(regexp=".*[0-9].*", message="Must have a number"),
		@Pattern(regexp=".*[+=-_{}*&%].*", message="Must have a symbol")
	})
	private String password;
	
	private String confirmPassword;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
}
