package fr.routin.test.domain.employee;

import fr.routin.test.domain.company.services.CompanyService;
import fr.routin.test.domain.employee.model.Employee;
import fr.routin.test.domain.employee.services.EmployeeService;

import java.util.List;

public record EmployeeByCompany(
        CompanyService companyService,
        EmployeeService employeeService
) {

    public List<Employee> getEmployeesByCompanyId(Long companyId) {
        companyService.exists(companyId);

        return employeeService.getEmployeesByCompanyId(companyId);
    }

    public Employee create(Employee employee) {
        //companyService.exists(employee.companyId());

        return employeeService.create(employee);
    }
}
