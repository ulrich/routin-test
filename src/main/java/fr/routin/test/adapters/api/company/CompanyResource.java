package fr.routin.test.adapters.api.company;

import fr.routin.test.domain.company.model.Company;
import fr.routin.test.domain.company.services.CompanyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/companies")
@RestController
public class CompanyResource {

    private final CompanyService companyService;

    public CompanyResource(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public ResponseEntity<List<Company>> companies() {
        List<Company> companies = companyService.findAll();

        return ResponseEntity.ok(companies);
    }
}
