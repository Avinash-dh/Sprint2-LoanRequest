package com.cg.LoanController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.LoanEntity.LoanRequest;
import com.cg.LoanExceptions.IdNotFoundException;
import com.cg.Service.LoanSevice;

@RestController
@RequestMapping("/LoanRequest")
@CrossOrigin("http://localhost:4200")
public class LoanController {
	@Autowired
LoanSevice Serviceobj;
	//create loanRequest
	@PostMapping("/LoanRequestcreate")
	public ResponseEntity<String> LoanRequestCreate(@RequestBody LoanRequest LoanDetails) {
		LoanRequest e = Serviceobj.CreateLoanDetails(LoanDetails);
		if (e == null) {
			throw new IdNotFoundException("Enter Valid accountId");
		} else {
			return new ResponseEntity<String>("LoanRequest created successfully", new HttpHeaders(), HttpStatus.OK);
			
		}
	}
	@GetMapping("/GetLoanRequest/{id}")
	private ResponseEntity<LoanRequest> getLoanRequest(@PathVariable("accountId") int accountId) {
		LoanRequest e = Serviceobj.getLoanDetailsbyaccountId(accountId);
		if (e == null) {
			throw new IdNotFoundException("Id does not exist,so we couldn't fetch details");
		} else {
			return new ResponseEntity<LoanRequest>(e, new HttpHeaders(), HttpStatus.OK);
		}
	}
	@GetMapping("/GetLoanApproval")
	private ResponseEntity<LoanRequest> getLoanApproval(@PathVariable("CreditScore") int CreditScore){
	LoanRequest e =Serviceobj.getLoanApprovalbyCreditScore(CreditScore);
	if(CreditScore>670) {
		throw new IdNotFoundException("loan approved");
	} else {
		return new ResponseEntity<LoanRequest>(e, new HttpHeaders(), HttpStatus.OK);
	}

	}
}