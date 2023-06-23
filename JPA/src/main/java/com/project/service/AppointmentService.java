package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
	@Autowired
	JdbcTemplate jt;
	//Appointmentpojo ap;

}
