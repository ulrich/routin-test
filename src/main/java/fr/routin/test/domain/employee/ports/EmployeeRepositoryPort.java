package fr.routin.test.domain.employee.ports;

import fr.routin.test.domain.company.model.Company;
import fr.routin.test.domain.employee.model.Employee;

import java.util.List;

public interface EmployeeRepositoryPort {

    List<Employee> fetchAll();

    Employee save(Employee employee, Company company);
}
