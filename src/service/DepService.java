package service;
import java.util.*;
import model.Department;

public interface DepService extends GenericService{
    List<Department> getAllDepartmentByHospital(Long id);
    Department findDepartmentByName(String name);
}
