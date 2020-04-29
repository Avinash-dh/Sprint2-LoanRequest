package com.cg.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.LoanDao.LoanDao;
import com.cg.LoanEntity.LoanRequest;

@Service
@Transactional
public class LoanSevice
{
	@Autowired
	LoanDao dao;
	public LoanRequest CreateLoanDetails(LoanRequest LoanDetails)
	{
	return dao.CreateLoanDetails(LoanDetails);
}
	public List<LoanRequest> getList()
	{
		return dao.getList();
	}
	public LoanRequest getLoanDetailsbyaccountId(int accountId) {
		return dao.getLoanDetailsbyaccountId(accountId);
	}
	public LoanRequest getLoanApprovalbyCreditScore(int CreditScore)
	{
	return dao.getLoanApprovalbyCreditScore(CreditScore) ;
	 
	}
}
