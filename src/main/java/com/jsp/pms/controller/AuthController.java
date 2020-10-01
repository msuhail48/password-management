package com.jsp.pms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.pms.dto.Login;
import com.jsp.pms.entity.AppUserDetails;
import com.jsp.pms.entity.Register;
import com.jsp.pms.service.AppUserService;
import com.jsp.pms.service.AuthService;

@Controller
@RequestMapping("/")
public class AuthController {
	
	@Autowired
	private AuthService authService;
	
	@Autowired
	private AppUserService appUserService;

	// @PostMapping(name = "/saveRegisterDetails")
	@RequestMapping("/saveRegisterDetails")
	public ModelAndView saveRegisterDetails(Register register) {
		authService.saveRegisterDetails(register);
		return new ModelAndView("login.jsp", "msg", "Registraion successfull please login!");
	}

	@RequestMapping("/login")
	public ModelAndView login(Login loginDTO, HttpServletRequest request) {
		Register register = authService.getRegisterDataByEmailAndPwd(loginDTO);
		if (register != null) {
			HttpSession session = request.getSession();
			session.setAttribute("register", register);
			List<AppUserDetails> list = appUserService.getAppdetailsByUserId(register.getId());
			list.forEach(a -> {
				System.out.println(a);
			});
			return new ModelAndView("home.jsp", "list", list);
		}
		return new ModelAndView("login.jsp", "msg", "Invalid credentials!!");
	}

}
