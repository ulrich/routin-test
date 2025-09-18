package fr.routin.test.configs.domain;

import fr.routin.test.domain.employee.ports.EmployeeRepositoryPort;
import fr.routin.test.domain.employee.services.EmployeeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeServiceConfiguration {

    @Bean
    public EmployeeService employeeService(
            EmployeeRepositoryPort employeeRepositoryPort
    ) {
        return new EmployeeService(employeeRepositoryPort);
    }
}