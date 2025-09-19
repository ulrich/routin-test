package fr.routin.test.domain.employee;

import fr.routin.test.domain.company.ports.CompanyRepositoryPort;
import fr.routin.test.domain.employee.ports.EmployeeRepositoryPort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class EmployeeByCompanyTest {

    @Mock
    CompanyRepositoryPort companyRepositoryPort;
    @Mock
    EmployeeRepositoryPort employeeRepositoryPort;

    EmployeeByCompany employeeByCompany;

    @BeforeEach
    void beforeEach() {
    }

    @Test
    void should_return_company() {
    }
}