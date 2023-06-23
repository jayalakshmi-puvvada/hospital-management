package com.project.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.project.pojo.ForgetPasswordPojo;

@Service
public class ForgetPasswordService {
	@Autowired
	JdbcTemplate jt;
	public List verification(ForgetPasswordPojo fp)
	{
	  String email=fp.getEmail();
	  
//		String role=fp.getRole();
//		if(role.equals("doctor")) {
		String sql="select email from patientRegistration where email=? ";
		 List details = jt.queryForList(sql, email);
		 System.out.println(details);
		 Map temp = (Map) details.get(0);
		 String str=(String)temp.get("email");
		 System.out.println(str);
		 if(str.equals(email))
		 {
			 String password=fp.getpPassword();
			  email=fp.getEmail();
			 String query="update patientRegistration set pPassword=? where email=? ";
			 jt.update(query,password,email);
		 }
//		 return details;
//	}
//		else if(role.equals("patient")) {
//			String sql="select email from patientRegistration where email=? AND role='patient'";
//			//System.out.println(sql);
//			 List details = jt.queryForList(sql, email);
//			 System.out.println(details);
//			 Map temp = (Map) details.get(0);
//			 String str=(String)temp.get("email");
//			 if(str.equals(email))
//			 {
//				 String password=fp.getPassword();
//				  email=fp.getEmail();
//				 String query="update patientRegistration set pPassword=? where email=? AND role='patient'";
//				 jt.update(query,password,email);
//			 }
			 return details;
		
	
		
	}
	}

