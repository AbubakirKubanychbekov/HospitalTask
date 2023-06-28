import db.DataBase;
import enums.Gender;
import model.Department;
import model.Doctor;
import model.Hospital;
import model.Patient;
import serviceImpl.DepServiceImpl;
import serviceImpl.DocServiceImpl;
import serviceImpl.HosServiceImpl;
import serviceImpl.PatServiceImpl;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Patient patient1=new Patient(10L,"Asan","Mirlanov",777889900,Gender.MALE,59);
        Patient patient2=new Patient(15L,"Fatima","Alieva",777889900,Gender.FEMALE,60);
        Patient patient3=new Patient(16L,"Almaz","Atambaev",777010100,Gender.MALE,62);
        List<Patient>patients=new ArrayList<>(List.of(patient1,patient2,patient3));
        List<Patient>patients1=new ArrayList<>(List.of(patient1));
        List<Patient>patients2=new ArrayList<>(List.of(patient2));
        List<Patient>patients3=new ArrayList<>(List.of(patient3));

        ArrayList<Patient>patients4=new ArrayList<>(List.of(
                new Patient(17L,"Uson","Mirbekov",707112233,Gender.MALE,40),
                new Patient(18L,"Zuhra","Nurova",502334455,Gender.FEMALE,45)));


        Doctor aibek=new Doctor(20L,"Aibek","Joldoshov",10,Gender.MALE);
        Doctor begimai=new Doctor(21L,"Begimai","Jumataeva",12,Gender.FEMALE);
        Doctor akhad=new Doctor(22L,"Akhad","Ayilchiev",15,Gender.MALE);
        Doctor dilbar=new Doctor(23L,"Dilbar","Sattarova",11,Gender.FEMALE);
        List<Doctor>doctors=new ArrayList<>(List.of(aibek,begimai,akhad,dilbar));
        List<Doctor>doctors1=new ArrayList<>(List.of(aibek));
        List<Doctor>doctors2=new ArrayList<>(List.of(begimai));
        List<Doctor>doctors3=new ArrayList<>(List.of(akhad));
        List<Doctor>doctors4=new ArrayList<>(List.of(dilbar));

        Department department1=new Department(30L,"Endocrinology",doctors2);
        Department department2=new Department(31L,"Nephrology",doctors1);
        Department department3=new Department(32L,"Hirurgiya",doctors3);
        Department department4=new Department(33L,"Traumatology",doctors4);
        List<Department>departments1=new ArrayList<>(List.of(department1,department2,department3,department4));
        List<Department>departments2=new ArrayList<>(List.of(department1));
        List<Department>departments3=new ArrayList<>(List.of(department2));
        List<Department>departments4=new ArrayList<>(List.of(department3));


        Hospital hospital1=new Hospital(40L,"Medicana","Bokonbaeva 29",departments2,doctors2,patients1);
        Hospital hospital2=new Hospital(41L,"Acibadem","Bulvar Erkindik 100",departments3,doctors1,patients2);
        List<Hospital>hospitals1=new ArrayList<>(List.of(hospital1,hospital2));
        List<Hospital>hospitals2=new ArrayList<>(List.of(hospital2));
        List<Hospital>hospitals3=new ArrayList<>(List.of(hospital1));
        List<Hospital>hospitals4=new ArrayList<>(List.of(
                new Hospital(42L,"Medikal park","Sovetskaya 22",departments4,doctors3,patients3)));




        DataBase dataBase=new DataBase(hospitals1,doctors,patients,departments1);

        PatServiceImpl patService=new PatServiceImpl(dataBase);

        HosServiceImpl hosService=new HosServiceImpl(dataBase);

        DocServiceImpl docService=new DocServiceImpl(dataBase);

        DepServiceImpl depService=new DepServiceImpl(dataBase);



        Scanner scanner=new Scanner(System.in);
        System.out.println("1.Get all hospital" +
                "\n2.Add hospital" +
                "\n3.Find hospital by id" +
                "\n4.Get all doctors by hospital id" +
                "\n5.Get all patient from hospital" +
                "\n6.Add patient to hospital" +
                "\n7.Get hospital by address" +
                "\n8.Assign doctor to department" +
                "\n9.Get all doctors by department" +
                "\n10.Get patient by id" +
                "\n11.Sort by age" +
                "\n12.Get all department by hospital" +
                "\n13.Find department by name " +
                "\n14.Delete hospital by id");
        int x;
        while (true){
            x= scanner.nextInt();
            switch (x){
                case 1: {
                    System.out.println("get all hospital");
                    System.out.println(hosService.getAllHospital());
                    break;
                } case 2:{
                    System.out.println("add hospital ");
                    System.out.println(hospitals4.get(0));
                    System.out.println(hosService.addHospital(hospitals4.get(0)));
                    break;
                } case 3:{System.out.println("find hospital by id");
                    System.out.println(hosService.findHospitalById(41L));
                    break;
                } case 4:{
                    System.out.println("get all doctors by hospital id ");
                    System.out.println(docService.getAllDoctorsByHospitalId(41L));
                    break;
                } case 5:{
                    System.out.println("get all patient from hospital ");
                    System.out.println(hosService.getAllPatientFromHospital(40L));
                    break;
                } case 6:{
                    System.out.println("add patient to hospital");
                    System.out.println(patService.addPatientsToHospital(41L,patients4.get(1)));
                } case 7:{
                    System.out.println("get hospital by address ");
                    System.out.println(hosService.getAllHospitalByAddress("Bokonbaeva 29"));
                    break;
                } case 8:{
                    System.out.println("assign doctor to department ");
                    System.out.println(docService.assignDoctorToDepartment(33L,doctors4));
                    break;
                } case 9:{
                    System.out.println("get all doctors by department");
                    System.out.println(docService.getAllDoctorsByDepartmentId(30L));
                    break;
                } case 10:{
                    System.out.println("get patient by id");
                    System.out.println(patService.getPatientById(15L));
                    break;
                } case 11:{
                    System.out.println("Sort by age");
                    System.out.println(patService.sortPatientsByAge("sort by age desc"));
                    break;
                } case 12:{
                    System.out.println("get all department by hospital");
                    System.out.println(depService.getAllDepartmentByHospital(40L));
                    break;
                } case 13:{
                    System.out.println("find department by name ");
                    System.out.println(depService.findDepartmentByName("Nephrology"));
                    break;
                } case 14:{
                    System.out.println("delete hospital by id ");
                    System.out.println(hosService.deleteHospitalById(41L));
                }
            }
        }
    }
}