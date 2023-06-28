package db;

import model.Department;
import model.Doctor;
import model.Hospital;
import model.Patient;

import java.util.*;

public class DataBase {
    private List<Hospital>hospitals;
    private List<Doctor>doctors;
    private List<Patient>patients;
    private List<Department>departments;

    public DataBase() {
    }

    public DataBase(List<Hospital> hospitals, List<Doctor> doctors, List<Patient> patients) {
        this.hospitals = hospitals;
        this.doctors = doctors;
        this.patients = patients;
    }

    public DataBase(List<Hospital> hospitals, List<Doctor> doctors, List<Patient> patients, List<Department> departments) {
        this.hospitals = hospitals;
        this.doctors = doctors;
        this.patients = patients;
        this.departments = departments;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<Hospital> getHospitals() {
        return hospitals;
    }

    public void setHospitals(List<Hospital> hospitals) {
        this.hospitals = hospitals;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
}
