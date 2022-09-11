package com.dbs.login.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.login.dto.ReceiverDTO;
import com.dbs.login.dto.SenderAccountDTO;
import com.dbs.login.dto.TransferDTO;
import com.dbs.login.model.BankEmp;
import com.dbs.login.model.ReceiverEntity;
import com.dbs.login.model.SenderAccountEntity;
import com.dbs.login.model.TransHistoryEntity;
import com.dbs.login.repo.BankEmpRepo;
import com.dbs.login.repo.ReceiverRepo;
import com.dbs.login.repo.SenderAccountRepo;
import com.dbs.login.repo.TransHistoryRepo;

@Service
public class BankEmpService {
	
	@Autowired
	BankEmpRepo bankEmpRepo;
	
	@Autowired
	SenderAccountRepo senderAccountRepo;
	
	@Autowired
	ReceiverRepo receiverRepo;
	
	@Autowired
	TransHistoryRepo transHistoryRepo;

	public BankEmp checkBankEmp(String userName, String password) {
	
		return bankEmpRepo.findByUserName(userName);
		
	}

	public SenderAccountDTO checkSenderAccount(int accountNo) {
		
		SenderAccountEntity senderAccountEntity =  senderAccountRepo.findById(accountNo).orElse(new SenderAccountEntity() );
		
		return new SenderAccountDTO(senderAccountEntity.getAccountno(),senderAccountEntity.getName(),senderAccountEntity.getBalance(),senderAccountEntity.isOd());
		
	}

	public ReceiverDTO checkBlockList(String receiverName, int senderAccountNo) {
		
		ReceiverEntity receiverEntity =  receiverRepo.findByName(receiverName);
		
		if(receiverEntity == null) {
			return new ReceiverDTO("No");
		}
		else {
			
			TransHistoryEntity trnaTransHistoryEntity = new TransHistoryEntity();
			
			trnaTransHistoryEntity.setSender(senderAccountNo);
			trnaTransHistoryEntity.setReceiver(receiverName);
			trnaTransHistoryEntity.setStatus("Failed");
			trnaTransHistoryEntity.setRemarks("BlockList Receiver");
			trnaTransHistoryEntity.setTransActionDate(new Date());
			
			transHistoryRepo.save(trnaTransHistoryEntity);
			
			return new ReceiverDTO("Yes");
		}
		
		
	}

	public void transfer(TransferDTO transferDTO) {
		
		boolean od = false;
		
		double balance = Double.parseDouble(transferDTO.getBalance()) - Double.parseDouble(transferDTO.getAmount());
		
		if( (transferDTO.getOd() != null) &&(transferDTO.getOd().equalsIgnoreCase("true"))) {
			od = true;
			
		}
		
		
		
		SenderAccountEntity senderAccountEntity = new SenderAccountEntity(Integer.parseInt(transferDTO.getsAccNo()), 
				transferDTO.getsName(), balance, od);
		
		senderAccountRepo.save(senderAccountEntity);
		
		
		
		TransHistoryEntity trnaTransHistoryEntity = new TransHistoryEntity();
		
		trnaTransHistoryEntity.setSender(Integer.parseInt(transferDTO.getsAccNo()));
		trnaTransHistoryEntity.setReceiver(transferDTO.getReceiverAccNo());
		trnaTransHistoryEntity.setStatus("Success");
		trnaTransHistoryEntity.setRemarks("TransAction Done Successfully");
		trnaTransHistoryEntity.setTransActionDate(new Date());
		
		transHistoryRepo.save(trnaTransHistoryEntity);
	
		
		
		
	}

	public List<TransHistoryEntity> getTransActionHistory() {
		return transHistoryRepo.findAll();
	}

}
