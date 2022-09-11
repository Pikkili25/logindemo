package com.dbs.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.login.model.SenderAccountEntity;

public interface SenderAccountRepo extends JpaRepository<SenderAccountEntity, Integer> {

}
