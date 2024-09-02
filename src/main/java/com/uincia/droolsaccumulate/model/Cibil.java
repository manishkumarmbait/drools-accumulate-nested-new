package com.uincia.droolsaccumulate.model;

import java.util.List;

public class Cibil {

	List<Account> listOfAccount;
//	private double balanceTotal;

	private Double Indi_Joint_No_Gold_agri_Loan_Balance;
	private Double Indi_Joint_Gold_agri_Loan_Balance;
	private Double All_Guarantor_Balance;
	private Double All_Indi_Joint_Balance;
	private Double All_All_Balance;

	public Cibil() {
	}

	public Cibil(List<Account> listOfAccount, Double indi_Joint_No_Gold_agri_Loan_Balance,
			Double indi_Joint_Gold_agri_Loan_Balance, Double all_Guarantor_Balance, Double all_Indi_Joint_Balance,
			Double all_All_Balance) {
		super();
		this.listOfAccount = listOfAccount;
		Indi_Joint_No_Gold_agri_Loan_Balance = indi_Joint_No_Gold_agri_Loan_Balance;
		Indi_Joint_Gold_agri_Loan_Balance = indi_Joint_Gold_agri_Loan_Balance;
		All_Guarantor_Balance = all_Guarantor_Balance;
		All_Indi_Joint_Balance = all_Indi_Joint_Balance;
		All_All_Balance = all_All_Balance;
	}

	public List<Account> getListOfAccount() {
		return listOfAccount;
	}

	public void setListOfAccount(List<Account> listOfAccount) {
		this.listOfAccount = listOfAccount;
	}

	public Double getIndi_Joint_No_Gold_agri_Loan_Balance() {
		return Indi_Joint_No_Gold_agri_Loan_Balance;
	}

	public void setIndi_Joint_No_Gold_agri_Loan_Balance(Double indi_Joint_No_Gold_agri_Loan_Balance) {
		Indi_Joint_No_Gold_agri_Loan_Balance = indi_Joint_No_Gold_agri_Loan_Balance;
	}

	public Double getIndi_Joint_Gold_agri_Loan_Balance() {
		return Indi_Joint_Gold_agri_Loan_Balance;
	}

	public void setIndi_Joint_Gold_agri_Loan_Balance(Double indi_Joint_Gold_agri_Loan_Balance) {
		Indi_Joint_Gold_agri_Loan_Balance = indi_Joint_Gold_agri_Loan_Balance;
	}

	public Double getAll_Guarantor_Balance() {
		return All_Guarantor_Balance;
	}

	public void setAll_Guarantor_Balance(Double all_Guarantor_Balance) {
		All_Guarantor_Balance = all_Guarantor_Balance;
	}

	public Double getAll_Indi_Joint_Balance() {
		return All_Indi_Joint_Balance;
	}

	public void setAll_Indi_Joint_Balance(Double all_Indi_Joint_Balance) {
		All_Indi_Joint_Balance = all_Indi_Joint_Balance;
	}

	public Double getAll_All_Balance() {
		return All_All_Balance;
	}

	public void setAll_All_Balance(Double all_All_Balance) {
		All_All_Balance = all_All_Balance;
	}

}
