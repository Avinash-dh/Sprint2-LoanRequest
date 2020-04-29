package com.cg.LoanEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="LoanRequest")
public class LoanRequest {
	
		   private int accountId;
	    @NotNull
		@Min(1000)
		@Max(10000000)
	       private int loanAmount;
	    @NotNull
		 @Min(12)
		 @Max(240)
	       private int tenure;
	    @NotNull
		 @Min(100)
		 @Max(1000)
	       private int CreditScore;
	    @NotNull
		 @Min(4)
		 @Max(10)
	       private int interestRate;
	       private String loantype;
	       private String Status;

		public int getAccountId() {
	    	  
		  return accountId;
	}
	      public void setAccountId(int accountId) {
		  this.accountId = accountId;
	}
	      public int getLoanAmount() {
		  return loanAmount;
	}
	      public void setLoanAmount(int loanAmount) {
		  this.loanAmount = loanAmount;
	}
	      public int getTenure() {
		  return tenure;
	}
	      public void setTenure(int tenure) {
		  this.tenure = tenure;
	}
	      public int getCreditScore() {
		  return CreditScore;
	}
	      public void setCreditScore(int creditScore) {
		  CreditScore = creditScore;
	}
	      public int getInterestRate() {
		  return interestRate;
	}
	      public void setInterestRate(int interestRate) {
		  this.interestRate = interestRate;
	}
	     public String getLoantype() {
		 return loantype;
	}
	     public void setLoantype(String loantype) {
		 this.loantype = loantype;
	}
	     public String getStatus() {
	 		return Status;
	 	}
	 	public void setStatus(String status) {
	 		Status = status;
	 	}
		@Override
		public String toString() {
			return "LoanDetails [accountId=" + accountId + ", loanAmount=" + loanAmount + ", tenure=" + tenure
					+ ", CreditScore=" + CreditScore + ", interestRate=" + interestRate + ", loantype=" + loantype
					+ ", Status=" + Status + "]";
		}


	}
