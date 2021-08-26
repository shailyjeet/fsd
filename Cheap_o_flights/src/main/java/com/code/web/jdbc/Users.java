package com.code.web.jdbc;

public class Users 
{

	private int admin_id;
	private String username;
	private String password;
	
	public Users(int admin_id, String username, String password) {
		super();
		this.admin_id = admin_id;
		this.username = username;
		this.password = password;
	}

	public Users(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Users [admin_id=" + admin_id + ", username=" + username + ", password=" + password + "]";
	}	
	
	
	
	
}



















