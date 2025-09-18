package fr.routin.test.adapters.api.employee;

import fr.routin.test.domain.employee.model.Employee;
import fr.routin.test.domain.employee.services.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/employees")
@RestController
public class EmployeeResource {
    private final EmployeeService employeeService;

    public EmployeeResource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public ResponseEntity<List<Employee>> employees() {
        List<Employee> employees = employeeService.findAll().stream().toList();

        return ResponseEntity.ok(employees);

//        return ResponseEntity.noContent()
//                .build();

    }
}
