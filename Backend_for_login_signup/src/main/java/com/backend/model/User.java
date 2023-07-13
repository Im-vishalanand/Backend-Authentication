package com.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user1")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotEmpty(message = "First name cannot be empty")
	@NotNull(message = "First name cannot be null")
	@NotBlank(message = "First name cannot be blank")
	private String firstName;

	@NotEmpty(message = "Last name cannot be empty")
	@NotNull(message = "Last name cannot be null")
	@NotBlank(message = "Last name cannot be blank")
	private String lastName;

	@NotEmpty(message = "Email cannot be empty")
	@NotNull(message = "Email name cannot be null")
	@NotBlank(message = "Email name cannot be blank")
	@Email(message = "Invalid email format")
	private String email;

	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;

	@JsonIgnore
	private String roles;
}
