package fr.routin.test.domain.company.services;

import fr.routin.test.domain.company.model.Company;
import fr.routin.test.domain.company.ports.CompanyRepositoryPort;
import fr.routin.test.providers.repositories.company.entities.CompanyEntity;

import java.util.List;
import java.util.Optional;

public record CompanyService(CompanyRepositoryPort companyRepositoryPort) {

    public List<Company> findAll() {
        return companyRepositoryPort.fetchAll();
    }

    public void exists(Long companyId) {
        if (!companyRepositoryPort.exists(companyId)) {
            throw new RuntimeException("Company with id " + companyId + " not found");
        }
    }

    public Company findById(Long companyId) {
        Optional<CompanyEntity> companyEntityOpt = companyRepositoryPort.findById(companyId);

        if(companyEntityOpt.isEmpty()) {
            throw new RuntimeException("Company with id " + companyId + " not found");
        }
        return companyEntityOpt.get().toDomain();
    }
}
