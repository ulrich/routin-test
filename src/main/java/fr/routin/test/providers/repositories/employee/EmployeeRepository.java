package fr.routin.test.providers.repositories.employee;

import fr.routin.test.domain.company.model.Company;
import fr.routin.test.domain.employee.model.Employee;
import fr.routin.test.domain.employee.ports.EmployeeRepositoryPort;
import fr.routin.test.providers.repositories.company.entities.CompanyEntity;
import fr.routin.test.providers.repositories.company.interfaces.CompanyJpaRepository;
import fr.routin.test.providers.repositories.employee.entities.EmployeeEntity;
import fr.routin.test.providers.repositories.employee.interfaces.EmployeeJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class EmployeeRepository implements EmployeeRepositoryPort {

    private final CompanyJpaRepository companyJpaRepository;
    private final EmployeeJpaRepository employeeJPARepository;

    public EmployeeRepository(
            CompanyJpaRepository companyJpaRepository,
            EmployeeJpaRepository employeeJPARepository
    ) {
        this.companyJpaRepository = companyJpaRepository;
        this.employeeJPARepository = employeeJPARepository;
    }

    @Override
    public List<Employee> fetchAll() {
        return employeeJPARepository.findAll().stream()
                .map(EmployeeEntity::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Employee save(Employee employee, Company company) {
        CompanyEntity companyEntity = companyJpaRepository.findById(company.id()).orElseThrow();

        EmployeeEntity employeeEntity =
                EmployeeEntity.fromDomain(companyEntity, employee);

        return employeeJPARepository.save(employeeEntity)
                .toDomain();
    }
}
