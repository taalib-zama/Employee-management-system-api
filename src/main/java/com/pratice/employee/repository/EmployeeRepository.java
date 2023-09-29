package com.pratice.employee.repository;

import com.pratice.employee.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.parser.Entity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {

}
