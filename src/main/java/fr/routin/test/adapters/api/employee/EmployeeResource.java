package fr.routin.test.adapters.api.employee;

import fr.routin.test.domain.employee.EmployeeByCompany;
import fr.routin.test.domain.employee.model.Employee;
import fr.routin.test.domain.employee.services.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
        List<Employee> employees = employeeService.findAll();

        return ResponseEntity.ok(employees);
    }

    @GetMapping("/company/{companyId}")
    public ResponseEntity<List<Employee>> employeesByCompanyId(@PathVariable Long companyId) {
        List<Employee> employees = employeeByCompany.getEmployeesByCompanyId(companyId);

        return ResponseEntity.ok(employees);
    }

    public ResponseEntity<Employee> addEmployee(Employee employee) {
        return ResponseEntity.ok(employeeByCompany.create(employee));
    }
}
