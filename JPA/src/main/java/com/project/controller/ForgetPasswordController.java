package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.pojo.ForgetPasswordPojo;
import com.project.service.ForgetPasswordService;

@RestController
public class ForgetPasswordController {
	@Autowired
	ForgetPasswordService fs;
	@PutMapping("/upass")
	public List verification(@RequestBody ForgetPasswordPojo fp ) {
		return fs.verification(fp);
}
}
