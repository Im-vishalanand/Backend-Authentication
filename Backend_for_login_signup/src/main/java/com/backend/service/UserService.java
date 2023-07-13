package com.backend.service;

import com.backend.dto.UserDTO;
import com.backend.exception.UserException;
import com.backend.model.User;

public interface UserService {

	public User addUser(User user, boolean isAdmin) throws UserException;

	public User userLogIn(UserDTO user) throws UserException;

}
