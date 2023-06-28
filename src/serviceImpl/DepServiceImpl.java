package serviceImpl;

import db.DataBase;
import model.Department;
import service.DepService;

import java.util.List;

public class DepServiceImpl implements DepService {
    private DataBase dataBase;

    public DepServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public List<Department> getAllDepartmentByHospital(Long id) {
        return dataBase.getDepartments();
    }

    @Override
    public Department findDepartmentByName(String name) {
        for (int i = 0; i < dataBase.getDepartments().size(); i++) {
            if (dataBase.getDepartments().get(i).getDepartmentName().equals(name)){
            return  dataBase.getDepartments().get(i);
            }
        }
        return null;
    }
}
