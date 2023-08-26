// src/main/java/com/beans/erp/repository/EmployeeRepository.java

package com.beans.erp.repository;

import com.beans.erp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
