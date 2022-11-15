package latihanKamisV2.service;

import java.util.ArrayList;
import java.util.List;

import latihanKamisV2.model.Student;

public class implStudentService implements studentService {
    private Student student = new Student();
    private List<Student> students = new ArrayList<>();

    @Override
    public String getFullName(int index) {
        // TODO Auto-generated method stub
        student = students.get(index);
        if(getTotalSks(index) >= 144) {
            return student.getFirstName() + " " + student.getLastName() + " ST";
        } else {
            return student.getFirstName() + " " + student.getLastName();
        }
    }

    @Override
    public int getTotalSks(int index) {
        // TODO Auto-generated method stub
        student = students.get(index);
        int total = 0;
        for (int i = 0; i < student.getSks().size(); i++) {
          total += student.getSks().get(i);
        }
        return total;
    }

    @Override
    public void studentRegistration(String firstName, String lastName, String domicile) {
        // TODO Auto-generated method stub
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setDomicile(domicile);

        students.add(student);
        System.out.println("Registrasi atas nama " + getFullName(students.indexOf(student)) + " telah berhasil dilakukan");

        student = new Student();
    }

    @Override
    public void learningPlan(String courseName, int sks, String room, int index) {
        // TODO Auto-generated method stub
        student = students.get(index);
  
        student.setCourseName(courseName);
        student.setSks(sks);
        student.setRoom(room);
    
        System.out.println("Data KRS berhasil ditambahkan. Pada NIM " + (index +1) + " atas nama " + getFullName(index));
    }

    @Override
    public void getSchedule(int index) {
        // TODO Auto-generated method stub
        student = students.get(index);
  
        System.out.println("|\t No. \t|\t Mata Kuliah \t|\t SKS \t|\t Ruangan \t|");
    
        for (int i = 0; i < student.getCourseName().size(); i++) {
            System.out.println("|\t" + (i + 1) + "\t|\t" + student.getCourseName().get(i) + "\t|\t" + student.getSks().get(i)+ "\t|\t" + student.getRoom().get(i) + "\t|");
        }
    }

    @Override
    public void getStudents() {
        // TODO Auto-generated method stub
        int index = 0;
        for (Student student : students) {
            System.out.println("\nIndex: " + index);  
            System.out.println("NIM: " + (index + 1));
            System.out.println("Nama lengkap: " + getFullName(index));
            System.out.println("Domisili: " + student.getDomicile() + "\n");
            index += 1;
        }
    }

    @Override
    public void getStudent(int index) {
        // TODO Auto-generated method stub
        student = students.get(index);
        System.out.println("Nama lengkap: " + getFullName(index));
        System.out.println("Domisili: " + student.getDomicile() + "\n");
    }
    
}
