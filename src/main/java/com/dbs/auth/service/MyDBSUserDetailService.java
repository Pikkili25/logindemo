package com.dbs.auth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dbs.auth.model.DBUserEntity;
import com.dbs.auth.repo.DBUserRepo;

@Service
public class MyDBSUserDetailService implements UserDetailsService{
	
	@Autowired
	DBUserRepo dBUserRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		DBUserEntity dBUserEntity = dBUserRepo.findByUserName(username);
		
		DBSUserDetails dBSUserDetails = new DBSUserDetails(dBUserEntity);
		
		List<GrantedAuthority> authorityList = (List<GrantedAuthority>) dBSUserDetails.getAuthorities();
		
		return dBSUserDetails;
	}

}
