package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.pojo.AppointmentDetailsPojo;
import com.project.service.AppointmentDetailsService;

@RestController
public class AppointmentDetailsController {
	@Autowired
	AppointmentDetailsService as;
	@PostMapping("/appDetails")
	public String PatientCredentials(@RequestBody AppointmentDetailsPojo ap) {
		
		return as.PatientCredentials(ap);
	}
	//getmapping for patientname and slot
	@GetMapping("/getApi")
	public List select(@RequestParam String appointmentId) {
		return as.select(appointmentId);
	}

	//getmapping for all patient details
	@GetMapping("/getAllApp")
	public List select1() {
		return as.select1();
	}
	//Getmapping for appointment details of specified doctor
	@GetMapping("/getDocApp")
	public List select2(@RequestParam String doctorName) {
		return as.select2(doctorName);
	}
	
}
