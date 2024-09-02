package com.uincia.droolsaccumulate.service;

import java.util.List;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uincia.droolsaccumulate.model.Account;
import com.uincia.droolsaccumulate.model.Cibil;
import com.uincia.droolsaccumulate.model.Response;

@Service
public class NestedAccumulateService {


	@Autowired
	private KieContainer kieContainer;
//	Account account = new Account();
//	public Rate getRate(Participant applicantRequest) {
//		Rate rate = new Rate();
//		KieSession kieSession = kieContainer.newKieSession();
//		kieSession.setGlobal("rate", rate);
//		kieSession.insert(applicantRequest);
//		kieSession.fireAllRules();
//		kieSession.dispose();
//		return rate;
//	}
//==========================working=======================================
//	public Cibil getResponse(Cibil cibil) {
//		Response response = new Response();
////		List<Account> listOfAccount = cibil.getListOfAccount();
////		
////		if(account != null) {
////			account = new Account();
////		}
////		Account account = new Account();
////		Cibil cibil1 = new Cibil();
//		KieSession kieSession = kieContainer.newKieSession();
//		kieSession.setGlobal("cibil", cibil);
//		kieSession.setGlobal("response", response);
////		kieSession.setGlobal("account", account);
//		kieSession.insert(cibil);
//		kieSession.fireAllRules();
//		kieSession.dispose();
//		return cibil;
//	}
//================================================================	
//	public Response getResponse(List<Deviation> guarantorList) {
//		Response response = new Response();
//		KieSession kieSession = kieContainer.newKieSession();
//		kieSession.setGlobal("response", response);
//		kieSession.insert(guarantorList);
//		kieSession.fireAllRules();
//		kieSession.dispose();
//		return response;
//	}
////======================== running =================================================
//	
//	public Cibil getResponse(Cibil cibil) {
//		//Response response = new Response();
//		//List<Account> listOfAccount = cibil.getListOfAccount();
//		KieSession kieSession = kieContainer.newKieSession();
//		//for(Account account : listOfAccount) {
//			
//		//	kieSession.setGlobal("response", response);
//	//		kieSession.setGlobal("account", account);			
//	//	}
//		kieSession.insert(cibil);
//		kieSession.fireAllRules();
//		kieSession.dispose();
//		return cibil;
//	}
	
	//======================== running =================================================
	
		public Cibil getResponse(Cibil cibil) {
			KieSession kieSession = kieContainer.newKieSession();
			kieSession.insert(cibil);
			kieSession.fireAllRules();
			kieSession.dispose();
			return cibil;
		}
		
}
