package com.dbs.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.login.dto.ReceiverDTO;
import com.dbs.login.dto.SenderAccountDTO;
import com.dbs.login.dto.TransferDTO;
import com.dbs.login.dto.User;
import com.dbs.login.model.BankEmp;
import com.dbs.login.model.TransHistoryEntity;
import com.dbs.login.service.BankEmpService;

@RestController
@CrossOrigin(origins = "*")
public class LoginController {
	
	@Autowired
	BankEmpService bankEmpService;
	
	
	@GetMapping("/getAllHistory")
	public List<TransHistoryEntity> getAllHistory() {
		
		return bankEmpService.getTransActionHistory();
	}
	
	@PostMapping("/transfer")
	public ResponseEntity transferMoney(@RequestBody TransferDTO transferDTO) {
		
		
		System.out.println("data from angular------from transferMoney()------>"+transferDTO);
		
		bankEmpService.transfer(transferDTO);
		
		return ResponseEntity.ok("Successfully Done");
	}
	
	@GetMapping("/loginUser")
	public ResponseEntity checkBankEmployee(@RequestParam String userName,@RequestParam String password) {
		
		
		System.out.println("data from url---->"+userName+".....password---->"+password);
		
		BankEmp bankEmp = bankEmpService.checkBankEmp(userName,password);
		
		return ResponseEntity.ok(new  User(bankEmp.getUserName(),bankEmp.getPassword()));
	}
	
	
	@GetMapping("/sender")
	public ResponseEntity checkSenderDetails(@RequestParam int accountNo) {
		
		
		SenderAccountDTO senderAccountDTO =  bankEmpService.checkSenderAccount(accountNo);
		
		return ResponseEntity.ok(senderAccountDTO);
		
	}
	@GetMapping("/receiver")
	public ReceiverDTO checkSenderDetails(@RequestParam String receiverName,@RequestParam int senderAccountNo) {
		
		
		return bankEmpService.checkBlockList(receiverName,senderAccountNo);
		
	}
	

}
