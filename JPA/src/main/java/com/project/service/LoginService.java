package com.project.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


import com.project.pojo.LoginPojo;

@Service
public class LoginService {
	@Autowired
	JdbcTemplate jt;
	 public String verifyCredentials(LoginPojo lp) {
	      
	        String email = lp.getEmail();
	       // System.out.println("email"+email);
	        String password = lp.getPassword();
	      // System.out.println("password"+password);
	        String role=lp.getRole();
	       System.out.println(role);
	        if(role.equals("doctor"))
	        {
	        	//System.out.println(role);
	        	String query = "SELECT * FROM patientRegistration WHERE email = ? AND pPassword = ? AND role='doctor' " ;
	        	
	        	List details = jt.queryForList(query, email, password);
	        	

		        if(details.isEmpty())
		        {
		        	
		        	return "Invalid User";
		        }
		        else
		        {
		        	
		        	return "Login Successful";
		        }
	        }
	        else if(role.equals("patient")){
	        	//System.out.println(role);
	        	
	        	String query = "SELECT * FROM patientRegistration WHERE email = ? AND pPassword = ? AND role='patient'" ;
	        
	        List details = jt.queryForList(query, email, password);
	        
	       
	        if(details.isEmpty())
	        {
	        	
	        	return "Invalid User";
	        }
	        else
	        {
	        	
	        	return "Login Successful";
	        }
	        }
			return "ok";
	
	}

}
