package fr.routin.test.configs.domain;

import fr.routin.test.domain.company.services.CompanyService;
import fr.routin.test.domain.employee.EmployeeByCompany;
import fr.routin.test.domain.employee.ports.EmployeeRepositoryPort;
import fr.routin.test.domain.employee.services.EmployeeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeServiceConfiguration {

    @Bean
    public EmployeeService employeeService(
            CompanyService companyService,
            EmployeeRepositoryPort employeeRepositoryPort
    ) {
        return new EmployeeService(companyService, employeeRepositoryPort);
    }

    @Bean
    public EmployeeByCompany getEmployeeByCompany(
            CompanyService companyService,
            EmployeeService employeeService
    ) {
        return new EmployeeByCompany(companyService, employeeService);
    }
}