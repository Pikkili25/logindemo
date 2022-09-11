package com.dbs.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.auth.model.DBUserEntity;
import com.dbs.auth.repo.DBUserRepo;

@Service
public class UserRoleService {
	
	@Autowired
	DBUserRepo dBUserRepo;;

	public void addNewUser(DBUserEntity dBUserEntity) {
		
		dBUserRepo.save(dBUserEntity);
	}

}
