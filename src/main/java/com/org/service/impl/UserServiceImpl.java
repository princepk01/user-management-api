package com.org.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.convertor.UserConvertor;
import com.org.dao.UserDAO;
import com.org.repository.UserRepository;
import com.org.request.dto.UserRequestDTO;
import com.org.response.dto.UserResponseDTO;
import com.org.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;

	@Transactional
	public long addUserDetail(UserRequestDTO userDTO) {
		UserDAO userDAO = UserConvertor.convertDTOtoDAO(userDTO);
		UserDAO save = repository.save(userDAO);
		return save.getId();
	}

	public UserResponseDTO getUserById(Long id) {
		UserDAO userDAO = repository.getOne(id);
		UserResponseDTO userResponseDTO = UserConvertor.convertDAOtoDTO(userDAO);
		return userResponseDTO;
	}

	@Override
	public List<UserResponseDTO> getAllUsers() {
		List<UserDAO> userListDAO = repository.findAll();
		List<UserResponseDTO> listDTO = UserConvertor.convertListDAOtoDTO(userListDAO);
		return listDTO;
	}
}
