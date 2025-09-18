package fr.routin.test.configs.domain;

import fr.routin.test.domain.company.ports.CompanyRepositoryPort;
import fr.routin.test.domain.company.services.CompanyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CompanyServiceConfiguration {

    @Bean
    public CompanyService companyService(
            CompanyRepositoryPort companyRepositoryPort
    ) {
        return new CompanyService(companyRepositoryPort);
    }
}