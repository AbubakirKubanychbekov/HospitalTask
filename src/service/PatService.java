package service;
import java.util.*;
import model.Patient;

public interface PatService extends GenericService{

    String addPatientsToHospital(Long id, Patient patient);
    Patient getPatientById(Long id);
    Map<Integer, Patient> getPatientByAge();
    List<Patient> sortPatientsByAge(String ascOrDesc);
}
