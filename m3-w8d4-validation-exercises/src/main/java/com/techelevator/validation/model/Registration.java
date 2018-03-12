package com.techelevator.validation.model;

import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

public class Registration {
	
	@NotBlank(message="field id blank")
	@Size(max=20, message="too large limit to 20 characters")
	private String firstName;
	
	@NotBlank(message="field id blank")
	@Size(max=20, message="too large limit to 20 characters")
	private String lastName;
	
	@NotBlank(message="field id blank")
	@Email(message="That isn't a real email")
	private String email;
	
	@NotBlank(message="field id blank")
	@Email(message="That isn't a real email")
	private String confirmEmail;
	
	@NotEmpty
	@Size(min=8, message="must be at least 8 characters long")
	@Pattern(regexp="[%&*\\()$#@!]+", message="must contain at least one special character") // have 1 0r more special char
	private String password;
	
	@NotEmpty
	@Size(min=8, message="must be at least 8 characters long")
	@Pattern(regexp="[%&*\\()$#@!]+", message="must contain at least one special character") // have 1 0r more special char
	private String confirmPassword;
	
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private LocalDate birthDate;
	
	
	@Min(value=1, message="too few tickets")
	@Max(value=10, message="too many tickets")
	//@Range(min=1, max=10)
	private int numOfTickets;
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getConfirmEmail() {
		return confirmEmail;
	}
	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
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
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public int getNumOfTickets() {
		return numOfTickets;
	}
	public void setNumOfTickets(int numOfTickets) {
		this.numOfTickets = numOfTickets;
	}
}
