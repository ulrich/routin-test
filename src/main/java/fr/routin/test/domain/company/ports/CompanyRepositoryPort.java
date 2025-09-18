package fr.routin.test.domain.company.ports;

import fr.routin.test.domain.company.model.Company;
import fr.routin.test.providers.repositories.company.entities.CompanyEntity;

import java.util.List;
import java.util.Optional;

public interface CompanyRepositoryPort {

    List<Company> fetchAll();

    boolean exists(Long companyId);

    Optional<CompanyEntity> findById(Long companyId);
}
