package com.banusha.tnsif.demotnsif.controls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.banusha.tnsif.demotnsif.EmpService;
import com.banusha.tnsif.demotnsif.model.Employee;

public class EmpController {
	@Autowired
	EmpService es;
	
	@PostMapping("/addemployee")
	public Employee addEmp(@RequestBody Employee emp) {
		return emp;
	}
		
	@DeleteMapping("/delettemp/{eid}")
	public void deleteEmp(@PathVariable int eid) {
		 es.deleteEmp(eid);
	}
	
	@PutMapping("/updateemp")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return es.updateEmp(emp);
	}
}
