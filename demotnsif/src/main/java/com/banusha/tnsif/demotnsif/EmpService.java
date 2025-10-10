package com.banusha.tnsif.demotnsif;

import org.springframework.beans.factory.annotation.Autowired;

import com.banusha.tnsif.demotnsif.model.Employee;
import com.banusha.tnsif.demotnsif.repo.EmpRepo;

public class EmpService {

	@Autowired
	EmpRepo er;
	
	//insert
	
	public Employee addEmp(Employee emp)
	{
		return er.save(emp);
	
	}

	public void deleteEmp(int eid) {
		 er.deleteById(eid); 
	}

	public Employee updateEmp(Employee emp) {
		Integer eid=emp.getEid();
		Employee emp1=er.findById(eid).get();
		emp1.setEname(emp.getEname());
		emp1.setEsal(emp.getEsal());
		return er.save(emp1);
	}
		
}

