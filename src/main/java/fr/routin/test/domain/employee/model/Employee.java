package fr.routin.test.domain.employee.model;

public record Employee(
        Long id,
        String firstname,
        String lastname,
        Long companyId) {
}
