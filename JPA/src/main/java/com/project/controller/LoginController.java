package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.pojo.LoginPojo;
import com.project.service.LoginService;

@RestController
public class LoginController {
	@Autowired
	LoginService ls;
	@PostMapping("/login")
    public String verifyCredentials(@RequestBody LoginPojo lp) {
		
		return ls.verifyCredentials(lp);
        
}
}