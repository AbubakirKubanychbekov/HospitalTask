package serviceImpl;

import db.DataBase;
import model.Hospital;
import model.Patient;
import service.HosService;

import java.util.List;

public class HosServiceImpl implements HosService {
    private DataBase dataBase;

    public HosServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public String addHospital(Hospital hospital) {
        dataBase.getHospitals().add(hospital);
        return "Successfully add hospital";
    }

    @Override
    public Hospital findHospitalById(Long id) {
        for (int i = 0; i < dataBase.getHospitals().size(); i++) {
            if (dataBase.getHospitals().get(i).getId().equals(id)){
                return dataBase.getHospitals().get(i);
            }
        }
        return null;
    }

    @Override
    public List<Hospital> getAllHospital() {
        return dataBase.getHospitals();
    }

    @Override
    public List<Patient> getAllPatientFromHospital(Long id) {
        List<Hospital> list = dataBase.getHospitals().stream().filter(hospital -> hospital.getId().equals(id)).toList();
        List<Patient> list1 = list.get(0).getPatients().stream().toList();
        return list1;
    }

    @Override
    public String deleteHospitalById(Long id) {
        for (int i = 0; i < dataBase.getHospitals().size(); i++) {
           if (dataBase.getHospitals().get(i).getId().equals(id)){
               System.out.println(dataBase.getHospitals().remove(i));
           }
        }
        return "Hospital is successfully delete";
    }

    @Override
    public Hospital getAllHospitalByAddress(String address) {
 //      Map<String,Hospital>hospitalMap=new HashMap<>();
        for (int i = 0; i < dataBase.getHospitals().size(); i++) {
            if (dataBase.getHospitals().get(i).getAddress().equals(address)){
             return   dataBase.getHospitals().get(i);
            }
        }
        return null;
    }

}
