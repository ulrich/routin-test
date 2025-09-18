package fr.routin.test.providers.repositories.employee.entities;

import fr.routin.test.domain.employee.model.Employee;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

    public Employee toDomain() {
        return new Employee(
                this.id,
                this.firstname,
                this.lastname
        );
    }
}
