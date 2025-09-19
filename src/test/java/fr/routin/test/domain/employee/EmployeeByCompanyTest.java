package fr.routin.test.domain.employee;

import fr.routin.test.domain.company.ports.CompanyRepositoryPort;
import fr.routin.test.domain.company.services.CompanyService;
import fr.routin.test.domain.employee.model.Employee;
import fr.routin.test.domain.employee.ports.EmployeeRepositoryPort;
import fr.routin.test.domain.employee.services.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class EmployeeByCompanyTest {

    @Mock
    CompanyRepositoryPort companyRepositoryPort;
    @Mock
    EmployeeRepositoryPort employeeRepositoryPort;

    EmployeeByCompany employeeByCompany;

    @BeforeEach
    void beforeEach() {
        CompanyService companyService = new CompanyService(companyRepositoryPort);
        EmployeeService employeeService = new EmployeeService(companyService, employeeRepositoryPort);

        employeeByCompany = new EmployeeByCompany(companyService, employeeService);
    }

    @Test
    void should_return_company() {
        // Given
        when(companyRepositoryPort.exists(1L)).thenReturn(true);

        // When
        when(employeeRepositoryPort.fetchAll())
                .thenReturn(List.of(new Employee(1L, "John", "Doe", 1L)));

        // Then
        employeeByCompany.getEmployeesByCompanyId(1L);
    }
}