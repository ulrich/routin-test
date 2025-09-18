package fr.routin.test.providers.repositories.employee.interfaces;

import fr.routin.test.providers.repositories.employee.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeJpaRepository extends JpaRepository<EmployeeEntity, Long> {
}
