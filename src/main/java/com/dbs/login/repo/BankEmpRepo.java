package com.dbs.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.login.model.BankEmp;

public interface BankEmpRepo extends JpaRepository<BankEmp, Integer>{
	
	
	BankEmp findByUserName(String userName);

}
