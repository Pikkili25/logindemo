package com.dbs.auth.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.auth.model.DBUserEntity;

public interface DBUserRepo extends JpaRepository<DBUserEntity, Integer>{

	DBUserEntity findByUserName(String username);

}
