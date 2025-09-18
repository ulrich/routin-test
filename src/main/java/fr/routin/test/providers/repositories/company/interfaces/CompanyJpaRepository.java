package fr.routin.test.providers.repositories.company.interfaces;

import fr.routin.test.providers.repositories.company.entities.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyJpaRepository extends JpaRepository<CompanyEntity, Long> {
}
