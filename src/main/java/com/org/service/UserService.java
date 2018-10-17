package com.org.service;

import java.util.List;

import com.org.request.dto.UserRequestDTO;
import com.org.response.dto.UserResponseDTO;

public interface UserService {

	public UserResponseDTO getUserById(Long id);

	public List<UserResponseDTO> getAllUsers();
}
