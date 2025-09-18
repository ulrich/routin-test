package fr.routin.test.domain.employee.services;

import fr.routin.test.domain.employee.model.Employee;
import fr.routin.test.domain.employee.ports.EmployeeRepositoryPort;

import java.util.List;

public record EmployeeService(EmployeeRepositoryPort employeeRepositoryPort) {

    // todo: find by companyId needed

    public List<Employee> findAll() {
        return employeeRepositoryPort.fetchAll();
    }
}
