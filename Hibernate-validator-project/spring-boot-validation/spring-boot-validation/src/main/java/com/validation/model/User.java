package com.validation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "name", nullable = false)
	// user name should not be null and empty
	// user name should have at least two characters
	
	@NotEmpty
	@Size(min = 2, message = "user name should have at least two characters")
	private String name;

	// email should be valid in email format
	// email should not be null and not empty
	@NotEmpty
	@Email(message = "email must be well format  empty")
	private String email;
	
	// password should not be null and not empty
	//password should have at least 8 character
	@NotEmpty
	@Size(min=8, message = "password should have at least 8 character")
	private String password;

	public User() {

	}

	public User(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

}
