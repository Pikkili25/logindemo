package com.dbs.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.login.model.TransHistoryEntity;

public interface TransHistoryRepo extends JpaRepository<TransHistoryEntity, Integer> {

}
