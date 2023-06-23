package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.project.pojo.PatientLoginPojo;

@Service
public class PatientLoginService {
@Autowired
JdbcTemplate jt;
public int insert(PatientLoginPojo lp) {
int sno=lp.getSno();
String name=lp.getName();
String specialization=lp.getSpecialization();
String area=lp.getArea();
String date=lp.getDate();
String slot=lp.getSlot();
String sql="insert into doctor values(?,?,?,?,?,?)";
int s=jt.update(sql,sno,name,specialization,area,date,slot);
return s;
}


}
