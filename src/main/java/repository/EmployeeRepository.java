package repository;

import entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository {

    List<Employee> findByName (String name);

}
