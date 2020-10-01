package com.jsp.pms.dto;

import java.io.Serializable;

public class Login implements Serializable{
	
	private String email;

	private String password;
	
	public Login() {
		// TODO Auto-generated constructor stub
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
		return "login [email=" + email + ", password=" + password + "]";
	}

	
	
}
