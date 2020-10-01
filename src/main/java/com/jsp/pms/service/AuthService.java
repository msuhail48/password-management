package com.jsp.pms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.pms.dao.AuthDAO;
import com.jsp.pms.dto.Login;
import com.jsp.pms.entity.Register;

@Service
public class AuthService {
	
	@Autowired
	private AuthDAO authDAO;
	
	public void saveRegisterDetails(Register register) {
		authDAO.saveRegisterDetails(register);
	}
	
	public Register getRegisterDataByEmailAndPwd(Login loginDTO) {
		return authDAO.getRegisterDataByEmailAndPwd(loginDTO);
	}

}
