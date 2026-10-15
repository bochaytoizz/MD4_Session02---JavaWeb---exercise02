package ra.employeemanagement.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ra.employeemanagement.model.Employee;
import ra.employeemanagement.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeControler {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeControler(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // Test tạm
    @GetMapping
    public List<Employee> getAll() {
        return employeeService.getAllEmployee();
    }
}
