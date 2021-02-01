package com.mona.springbootjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mona.springbootjpa.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
