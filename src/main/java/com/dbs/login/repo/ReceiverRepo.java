package com.dbs.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.login.model.ReceiverEntity;

public interface ReceiverRepo extends JpaRepository<ReceiverEntity, String> {

	ReceiverEntity findByName(String receiverName);

}
