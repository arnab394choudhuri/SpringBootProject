package com.lti.entity;

import javax.persistence.Entity;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Employee {
   String name;
   String id;
   
   public Employee()
   {
	   
   }
   
   public Employee(String name,String id)
   {
	   this.name=name;
	   this.id=id;
   }
   
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
}
