package com.jsp.pms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.pms.entity.AppUserDetails;
import com.jsp.pms.entity.Register;
import com.jsp.pms.service.AppUserService;

@Controller
@RequestMapping(value = "/")
public class AppUserController {

	@Autowired
	private AppUserService appUserService;

	public AppUserController() {
		System.out.println(this.getClass().getSimpleName() + " created");
	}

	// @PostMapping("*/saveUserData")
	@RequestMapping(value = "/saveUserData")
	public ModelAndView saveUserData(AppUserDetails appUserDetails, HttpServletRequest request) {
		System.out.println(appUserDetails);
		Register register = (Register) request.getSession().getAttribute("register");
		appUserDetails.setRegister(register);
		System.out.println(appUserDetails);
		appUserService.saveUserData(appUserDetails);
		List<AppUserDetails> list = appUserService.getAppdetailsByUserId(register.getId());
		return new ModelAndView("home.jsp", "list", list);
	}
}
