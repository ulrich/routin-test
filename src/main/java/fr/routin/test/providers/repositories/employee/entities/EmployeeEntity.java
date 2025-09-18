package fr.routin.test.providers.repositories.employee.entities;

import fr.routin.test.domain.employee.model.Employee;
import fr.routin.test.providers.repositories.company.entities.CompanyEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employee")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column(length = 25, nullable = false)
    private String firstname;

    @Column(length = 25, nullable = false)
    private String lastname;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false, name = "company_id", referencedColumnName = "id")
    private CompanyEntity company;

    public Employee toDomain() {
        Long companyId = company.toDomain().id();

        return new Employee(
                id,
                firstname,
                lastname,
                companyId
        );
    }

    public static EmployeeEntity fromDomain(CompanyEntity companyEntity, Employee employee) {
        return new EmployeeEntity(
                employee.id(),
                employee.firstname(),
                employee.lastname(),
                companyEntity);
    }
}
