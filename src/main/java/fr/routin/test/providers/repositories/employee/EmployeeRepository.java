package fr.routin.test.providers.repositories.employee;

import fr.routin.test.domain.employee.model.Employee;
import fr.routin.test.domain.employee.ports.EmployeeRepositoryPort;
import fr.routin.test.providers.repositories.employee.entities.EmployeeEntity;
import fr.routin.test.providers.repositories.employee.interfaces.EmployeeJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class EmployeeRepository implements EmployeeRepositoryPort {

    private final EmployeeJpaRepository employeeJPARepository;

    public EmployeeRepository(EmployeeJpaRepository employeeJPARepository) {
        this.employeeJPARepository = employeeJPARepository;
    }

    @Override
    public List<Employee> fetchAll() {
        return employeeJPARepository.findAll().stream()
                .map(EmployeeEntity::toDomain)
                .collect(Collectors.toList());
    }
}
