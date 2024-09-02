package com.uincia.droolsaccumulate.model;

import java.util.List;

public class Account {

	private int accountId;
	private int customerId;
	private double balance;
	private int loanType;
	private int ownership;
	List<AccountDtls> listOfAccountDtls;

//========================================================================================	
	private Double Indi_Joint_No_Gold_agri_Loan_OD;
	private Double Indi_Joint_Gold_agri_Loan_OD;
	private Double All_Guarantor_OD;
	private Double All_Indi_Joint_OD;
	private Double All_All_OD;

//========================================================================================	
	public Account() {
	}

	public Account(int accountId, int customerId, double balance, int loanType, int ownership,
			List<AccountDtls> listOfAccountDtls) {
		super();
		this.accountId = accountId;
		this.customerId = customerId;
		this.balance = balance;
		this.loanType = loanType;
		this.ownership = ownership;
		this.listOfAccountDtls = listOfAccountDtls;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getLoanType() {
		return loanType;
	}

	public void setLoanType(int loanType) {
		this.loanType = loanType;
	}

	public int getOwnership() {
		return ownership;
	}

	public void setOwnership(int ownership) {
		this.ownership = ownership;
	}

	public List<AccountDtls> getListOfAccountDtls() {
		return listOfAccountDtls;
	}

	public void setListOfAccountDtls(List<AccountDtls> listOfAccountDtls) {
		this.listOfAccountDtls = listOfAccountDtls;
	}

	public Double getIndi_Joint_No_Gold_agri_Loan_OD() {
		return Indi_Joint_No_Gold_agri_Loan_OD;
	}

	public void setIndi_Joint_No_Gold_agri_Loan_OD(Double indi_Joint_No_Gold_agri_Loan_OD) {
		Indi_Joint_No_Gold_agri_Loan_OD = indi_Joint_No_Gold_agri_Loan_OD;
	}

	public Double getIndi_Joint_Gold_agri_Loan_OD() {
		return Indi_Joint_Gold_agri_Loan_OD;
	}

	public void setIndi_Joint_Gold_agri_Loan_OD(Double indi_Joint_Gold_agri_Loan_OD) {
		Indi_Joint_Gold_agri_Loan_OD = indi_Joint_Gold_agri_Loan_OD;
	}

	public Double getAll_Guarantor_OD() {
		return All_Guarantor_OD;
	}

	public void setAll_Guarantor_OD(Double all_Guarantor_OD) {
		All_Guarantor_OD = all_Guarantor_OD;
	}

	public Double getAll_Indi_Joint_OD() {
		return All_Indi_Joint_OD;
	}

	public void setAll_Indi_Joint_OD(Double all_Indi_Joint_OD) {
		All_Indi_Joint_OD = all_Indi_Joint_OD;
	}

	public Double getAll_All_OD() {
		return All_All_OD;
	}

	public void setAll_All_OD(Double all_All_OD) {
		All_All_OD = all_All_OD;
	}

}
