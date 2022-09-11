package com.dbs.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.auth.model.DBUserEntity;
import com.dbs.auth.service.UserRoleService;

@RestController
public class DBSAuthController {

	@Autowired
	UserRoleService userRoleService;
	
	@RequestMapping("/home")
	public String sayHello() {
		
		return "Welcome Home Page .. Access for All";
	}
	
	@RequestMapping("/user")
	public String dbsUser() {
		
		return "Welcome User Page .. Access for only for User and Admin";
	}
	
	@RequestMapping("/admin")
	public String dbsAdmin() {
		
		return "Welcome Admin Page .. Access for only for  Admin";
	}
	
	@PostMapping("/dbs/user/add")
	public String addNewUser(@RequestBody DBUserEntity dBUserEntity) {
		
		userRoleService.addNewUser(dBUserEntity);
		
		return "Successfully Added New User!!!!!!!!";
	}
	
}
