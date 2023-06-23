package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.pojo.PatientLoginPojo;
import com.project.service.PatientLoginService;

@RestController
public class PatientLoginController {
@Autowired
PatientLoginService ps;
@PostMapping("/insert")
public String insert(@RequestBody PatientLoginPojo lp) {
	int s=ps.insert(lp);
	if(s>0) {
		return "data inserted";
	}else {
		return "data not inserted";
	}
}


}
