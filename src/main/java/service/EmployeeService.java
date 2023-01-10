package service;

import org.springframework.stereotype.Service;
import repository.EmployeeRepository;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void addEmployee()
    {

    }

    public void findByName(String name)
    {
        employeeRepository.findByName(name);
    }
}
