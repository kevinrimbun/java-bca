package latihanKamisV2.service;

public interface studentService {
    String getFullName (int index);

    int getTotalSks (int index);

    void studentRegistration(String firstName, String lastName, String domicile);
  
    void learningPlan(String courseName, int sks, String room, int index);

    void getSchedule(int index);
  
    void getStudents();
  
    void getStudent(int index);
    
}
