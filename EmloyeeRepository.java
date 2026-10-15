package ra.employeemanagement.repository;

import org.springframework.stereotype.Repository;
import ra.employeemanagement.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EmloyeeRepository {
    // Giả lập database bằng List
    private final List<Employee> employeeList = new ArrayList<>();
    private Long currentId = 1L;

    // Lưu nhân viên mới
    public Employee save (Employee employee) {
        employee.setId(currentId++);
        employeeList.add(employee);
        return employee;
    }

    // Lấy tất cả
    public List<Employee> findAll() {
        return new ArrayList<>(employeeList);
    }

    // Tìm theo Id
    public Optional<Employee> findById(Long id) {
        return employeeList.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst();
    }
}
