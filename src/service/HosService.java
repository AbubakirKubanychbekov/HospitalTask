package service;
import model.Hospital;
import model.Patient;

import java.util.*;


public interface HosService extends GenericService{
    String addHospital(Hospital hospital);
    Hospital findHospitalById(Long id);
    List<Hospital> getAllHospital();
    List<Patient> getAllPatientFromHospital(Long id);
    String deleteHospitalById(Long id);
    Hospital getAllHospitalByAddress(String address);
}
