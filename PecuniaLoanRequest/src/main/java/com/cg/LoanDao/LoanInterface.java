package com.cg.LoanDao;

import java.util.List;

import com.cg.LoanEntity.LoanRequest;

public interface LoanInterface {
	LoanRequest CreateLoanDetails(LoanRequest LoanDetails);
	List<LoanRequest> getList();
	LoanRequest getLoanDetailsbyaccountId(int accountId);
	LoanRequest getLoanApprovalbyCreditScore(int CreditScore);
}
