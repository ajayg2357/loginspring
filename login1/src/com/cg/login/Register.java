package com.cg.login;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Component
public class Register {

	@NotEmpty
	@Size(min = 4, max = 10, message = "please enter name as per instructions")
	private String firstName;
	@NotEmpty
	@Size(min = 4, max = 10, message = "please enter name as per instructions")
	private String lastName;

	private char gender;
	@NotEmpty
	@Email(message = "enter a valild email")
	private String email;

	private String[] skillSet;

	private String city;

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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String[] getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String[] skillSet) {
		this.skillSet = skillSet;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
