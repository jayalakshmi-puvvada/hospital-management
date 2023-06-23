package com.project.controller;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.service.PatientService;


@RestController
public class PatientController {

	@Autowired
	PatientService service;
	
	@GetMapping("/info/getAll")
	public List<Map<String,Object>> getAllData() {
		return service.getPatientInfo();
	}

}