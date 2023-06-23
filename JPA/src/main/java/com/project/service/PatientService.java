package com.project.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.project.pojo.PatientInfoPojo;


@Service
public class PatientService {
@Autowired
	JdbcTemplate jdbc;
	
	public int insertPatientInfo(PatientInfoPojo obj) {
		String pId = obj.getpId();
		String firstName = obj.getFirstName();
		String lastName = obj.getLastName();
		String email = obj.getEmail();
		String gender = obj.getGender();
		String area = obj.getArea();
		int age = obj.getAge();
		long pPhoneNo = obj.getpPhoneNo();
		String pPassword = obj.getpPassword();
		String userName = obj.getUserName();
		int a=email.indexOf('@');
		userName=email.substring(0,a);
		int rows;
		String query = "insert into patientRegistration values(?,?,?,?,?,?,?,?,?,?)";
	List previous = this.getPatientInfoByMail(email);
		if(previous.isEmpty()) {
			rows = jdbc.update(query, pId, firstName, lastName, gender, age, area, email, pPassword, pPhoneNo,userName);
		}
		else {
			rows=0;
		}
		return rows;
	}
	
	public List<Map<String,Object>> getPatientInfo() {
		String query = "select * from patientRegistration";
		return jdbc.queryForList(query);
	}
	
	public List<Map<String,Object>> getPatientInfoByMail(String mail) {
		String query = "select * from patientRegistration where email=?";
		return jdbc.queryForList(query, mail);
	}
	

}