package com.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.backend.dto.UserDTO;
import com.backend.exception.UserException;
import com.backend.model.User;
import com.backend.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User addUser(User user, boolean isAdmin) throws UserException {

		if (isAdmin) {
			user.setRoles("ROLE_ADMIN");
		} else {
			user.setRoles("ROLE_USER");
		}

		return userRepository.save(user);

	}

	@Override
	public User userLogIn(UserDTO user) throws UserException {
		return null;
	}

}
