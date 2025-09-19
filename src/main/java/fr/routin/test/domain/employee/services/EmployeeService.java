package fr.routin.test.domain.employee.services;

import fr.routin.test.domain.company.model.Company;
import fr.routin.test.domain.company.services.CompanyService;
import fr.routin.test.domain.employee.model.Employee;
import fr.routin.test.domain.employee.ports.EmployeeRepositoryPort;

import java.util.List;

public record EmployeeService(
        CompanyService companyService,
        EmployeeRepositoryPort employeeRepositoryPort) {

    public List<Employee> findAll() {
        return List.of();
    }

    public List<Employee> getEmployeesByCompanyId(Long companyId) {
        return List.of();
    }

    public Employee create(Employee employee) {
        Company company = companyService.findById(employee.companyId());

        return employeeRepositoryPort.save(employee, company);
    }
}
