package com.cg.LoanDao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.LoanEntity.LoanRequest;
@Repository
public class LoanDao implements LoanInterface {
	@PersistenceContext	
	 EntityManager em;
	
	@Override
	public LoanRequest CreateLoanDetails(LoanRequest LoanDetails) {
		// TODO Auto-generated method stub
		LoanRequest l=em.merge(LoanDetails);
		return l;
	}

	@Override
	public List<LoanRequest> getList() {
		Query q=em.createQuery("select m from LoanRequest m");
		List<LoanRequest> loanlist=q.getResultList();
		// TODO Auto-generated method stub
		return loanlist;
	}

	@Override
	public LoanRequest getLoanDetailsbyaccountId(int accountId) {
		// TODO Auto-generated method stub
		return em.find(LoanRequest.class,accountId);
	}
	@Override
	public LoanRequest getLoanApprovalbyCreditScore(int CreditScore) {
		// TODO Auto-generated method stub
		return em.find(LoanRequest.class, CreditScore);
	}
	
}
