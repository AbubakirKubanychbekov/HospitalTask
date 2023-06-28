package serviceImpl;

import db.DataBase;
import model.Hospital;
import model.Patient;
import service.PatService;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class PatServiceImpl implements PatService {
    private DataBase dataBase;

    public PatServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }


    @Override
    public String addPatientsToHospital(Long id, Patient patient) {
        List<Hospital> list = dataBase.getHospitals().stream().filter(hospital -> hospital.getId().equals(id)).toList();
        list.get(0).getPatients().add(patient);
        return "Successfully add patient to hospital";
    }

    @Override
    public Patient getPatientById(Long id) {
        for (int i = 0; i < dataBase.getPatients().size(); i++) {
            if (dataBase.getPatients().get(i).getId().equals(id)){
              return   dataBase.getPatients().get(i);
            }
        }
        return null;
    }

    @Override
    public Map<Integer, Patient> getPatientByAge() {
        return null;
    }

    @Override
    public List<Patient> sortPatientsByAge(String ascOrDesc) {
        List<Patient> list = dataBase.getPatients().stream().sorted(Comparator.comparing(Patient::getAge)).toList();
        return list;
    }

}
