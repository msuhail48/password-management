package com.jsp.pms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.pms.dao.AppUserDAO;
import com.jsp.pms.entity.AppUserDetails;

@Service
public class AppUserService {
	
	@Autowired
	private AppUserDAO appUserDAO;

	public AppUserService() {
		System.out.println(this.getClass().getSimpleName() + " created");
	}

	public void saveUserData(AppUserDetails appUserDetails) {
		appUserDAO.saveUserData(appUserDetails);
	}

	public List<AppUserDetails> getAppdetailsByUserId(Long id) {
		return appUserDAO.getAppdetailsByUserId(id);
	}

}
