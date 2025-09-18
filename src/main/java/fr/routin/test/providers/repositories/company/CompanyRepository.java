package fr.routin.test.providers.repositories.company;

import fr.routin.test.domain.company.model.Company;
import fr.routin.test.domain.company.ports.CompanyRepositoryPort;
import fr.routin.test.providers.repositories.company.entities.CompanyEntity;
import fr.routin.test.providers.repositories.company.interfaces.CompanyJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class CompanyRepository implements CompanyRepositoryPort {

    private final CompanyJpaRepository companyJpaRepository;

    public CompanyRepository(CompanyJpaRepository companyJpaRepository) {
        this.companyJpaRepository = companyJpaRepository;
    }

    @Override
    public List<Company> fetchAll() {
        return companyJpaRepository.findAll().stream()
                .map(CompanyEntity::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public boolean exists(Long companyId) {
        return companyJpaRepository.findById(companyId).isPresent();
    }

    @Override
    public Optional<CompanyEntity> findById(Long companyId) {
        return companyJpaRepository.findById(companyId);
    }
}
