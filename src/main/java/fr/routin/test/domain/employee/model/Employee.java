package fr.routin.test.domain.employee.model;

import jakarta.validation.constraints.NotBlank;

public record Employee(
        Long id,
        @NotBlank
        String firstname,
        @NotBlank
        String lastname,
        Long companyId) {
}
