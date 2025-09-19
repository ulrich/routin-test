package fr.routin.test.adapters.api.employee;

import fr.routin.test.domain.employee.EmployeeByCompany;
import fr.routin.test.domain.employee.model.Employee;
import fr.routin.test.domain.employee.services.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Validated
@RequestMapping("/employees")
@RestController
public class EmployeeResource {

    private final EmployeeService employeeService;
    private final EmployeeByCompany employeeByCompany;

    public EmployeeResource(
            EmployeeService employeeService,
            EmployeeByCompany employeeByCompany
    ) {
        this.employeeService = employeeService;
        this.employeeByCompany = employeeByCompany;
    }

    @GetMapping
    public ResponseEntity<List<Employee>> employees() {
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/company/{companyId}")
    public ResponseEntity<List<Employee>> employeesByCompanyId(@PathVariable Long companyId) {
        return ResponseEntity.noContent().build();
    }
}
