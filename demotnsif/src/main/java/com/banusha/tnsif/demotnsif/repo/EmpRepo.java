package com.banusha.tnsif.demotnsif.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banusha.tnsif.demotnsif.model.Employee;

//MarkerTnterface....................
public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
