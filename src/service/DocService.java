package service;
import java.util.*;
import model.Doctor;

public interface DocService extends GenericService {
    // Department‘ти id менен табып, анан Doctor‘лорду листтеги айдилери менен табып анан ошол табылган Department'ге табылган Doctor'лорду кошуп коюнунуз
    String assignDoctorToDepartment(Long departmentId, List<Doctor>doctorsId);
    List<Doctor> getAllDoctorsByHospitalId(Long id);
    List<Doctor> getAllDoctorsByDepartmentId(Long id);
}
