package com.org.convertor;

import java.util.ArrayList;
import java.util.List;

import com.org.dao.UserDAO;
import com.org.request.dto.UserRequestDTO;
import com.org.response.dto.UserResponseDTO;

public class UserConvertor {

	public static UserDAO convertDTOtoDAO(UserRequestDTO userDTO) {

		UserDAO userDAO = new UserDAO();
		if (userDTO != null) {
			userDAO.setId(userDTO.getId());
			userDAO.setUserId(userDTO.getUserId());
			userDAO.setName(userDTO.getName());
			userDAO.setDateOfBirth(userDTO.getDateOfBirth());
			userDAO.setFatherName(userDTO.getFatherName());
			userDAO.setMotherName(userDTO.getMotherName());
			userDAO.setMobileNumber(userDTO.getMobileNumber());
			userDAO.setGender(userDTO.getGender());
			userDAO.setPermanentAddress(userDTO.getPermanentAddress());
			userDAO.setPresentAddress(userDTO.getPresentAddress());
			userDAO.setCountry(userDTO.getCountry());
			userDAO.setState(userDTO.getState());
			userDAO.setCity(userDTO.getCity());
			userDAO.setPinCode(userDTO.getPinCode());
			userDAO.setGmtCreated(userDTO.getGmtCreated());
			userDAO.setGmtModified(userDTO.getGmtModified());
		}

		return userDAO;
	}

	public static List<UserResponseDTO> convertListDAOtoDTO(List<UserDAO> listDAO) {

		ArrayList<UserResponseDTO> lsitDTO = new ArrayList<>();
		for (UserDAO userDAO : listDAO) {
			lsitDTO.add(convertDAOtoDTO(userDAO));
		}
		return lsitDTO;
	}

	public static UserResponseDTO convertDAOtoDTO(UserDAO userDAO) {
		UserResponseDTO userDTO = new UserResponseDTO();
		if (userDAO != null) {
			userDTO.setId(userDAO.getId());
			userDTO.setUserId(userDAO.getUserId());
			userDTO.setName(userDAO.getName());
			userDTO.setEmail(userDAO.getEmail());
			userDTO.setDateOfBirth(userDAO.getDateOfBirth());
			userDTO.setFatherName(userDAO.getFatherName());
			userDTO.setMotherName(userDAO.getMotherName());
			userDTO.setMobileNumber(userDAO.getMobileNumber());
			userDTO.setGender(userDAO.getGender());
			userDTO.setPermanentAddress(userDAO.getPermanentAddress());
			userDTO.setPresentAddress(userDAO.getPresentAddress());
			userDTO.setCountry(userDAO.getCountry());
			userDTO.setState(userDAO.getState());
			userDTO.setCity(userDAO.getCity());
			userDTO.setPinCode(userDAO.getPinCode());
			userDTO.setGmtCreated(userDAO.getGmtCreated());
			userDTO.setGmtModified(userDAO.getGmtModified());
		}
		return userDTO;
	}
}
