package com.org.controller.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.org.common.exception.CommonException;
import com.org.request.dto.Login;
import com.org.response.dto.UserResponseDTO;
import com.org.service.UserService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(value = "/rest/users")
public class UserRestController {
	private static final Logger logger = LoggerFactory.getLogger(UserRestController.class);
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/getall", method = RequestMethod.GET)
	public List<UserResponseDTO> getAllUsers() {
		logger.info("get all method calling...");
		List<UserResponseDTO> userList = userService.getAllUsers();
		for (UserResponseDTO userResponseDTO : userList) {
			System.out.println(userResponseDTO);
		}
		logger.info("get all methood ending......");
		return userList;
	}

	@RequestMapping(value = "/one/{id}", method = RequestMethod.GET)
	public UserResponseDTO getUserById(@PathVariable(value = "id") Long id) {
		UserResponseDTO userDTO = userService.getUserById(id);
		return userDTO;
	}

	@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
	@RequestMapping(value = "/login", method = RequestMethod.POST, consumes = "application/json")
	public Object loginDetail(@RequestBody Login login) throws CommonException {
		if (login.getUserName() == null)
			// BizAssert.notNull(login,
			// UserAccountResultCode.USER_NAME_INVALID);
			// throw new CommonException("Username can not be null or empty");
			System.out.println(login);
		return "loginDetail";
	}
}
