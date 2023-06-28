package serviceImpl;

import db.DataBase;
import model.Department;
import model.Doctor;
import model.Hospital;
import service.DocService;
import java.util.Comparator;
import java.util.List;

public class DocServiceImpl implements DocService {
    private DataBase dataBase;

    public DocServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public String assignDoctorToDepartment(Long departmentId, List<Doctor> doctorsId) {
        dataBase.getDepartments()
                .stream().filter(department -> department.getId().equals(departmentId))
                .findFirst().ifPresent(department -> department.setDoctors(doctorsId));
        return "Successfully assign doctor to department";
    }

    @Override
    public List<Doctor> getAllDoctorsByHospitalId(Long id) {
        List<Hospital> list = dataBase.getHospitals().stream().filter(hospital -> hospital.getId().equals(id)).toList();
        List<Doctor> list1 = list.get(0).getDoctors().stream().toList();
        return list1;
    }

    @Override
    public List<Doctor> getAllDoctorsByDepartmentId(Long id) {
        List<Department> list = dataBase.getDepartments().stream().filter(department -> department.getId().equals(id)).toList();
        List<Doctor> list1 = list.get(0).getDoctors().stream().toList();

        return list1;
    }
}
