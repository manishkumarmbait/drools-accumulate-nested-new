package com.uincia.droolsaccumulate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uincia.droolsaccumulate.model.Cibil;
import com.uincia.droolsaccumulate.service.NestedAccumulateService;

@RestController
@RequestMapping("/ruleservice")
public class NestedAccumulateController {

	@Autowired
	private NestedAccumulateService nestedAccumulateService;

	@PostMapping("/getOD")
	public ResponseEntity<Cibil> getRate(@RequestBody Cibil guarantorDeviation) {
		Cibil cibil = nestedAccumulateService.getResponse(guarantorDeviation);
		return new ResponseEntity<>(cibil, HttpStatus.OK);
	}

}
