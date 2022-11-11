package latihanKamis.service;

import latihanKamis.abstractClass.LearningPlan;

public class Student implements LearningPlan  {
    protected static int sks;
    protected static String roomStudent;



    public Student(){
        
    }

    public Student(int sks, String roomStudent) {
        Student.sks = sks;
        Student.roomStudent = roomStudent;

    }

    public void setSks(int sks){
        Student.sks = sks;
    }

    public int getSks(){
        return sks;
    }


    public static void setRoomStudent(String roomStudent) {
        Student.roomStudent = roomStudent;
    }

    public static String getRoomStudent() {
        return roomStudent;
    }

    // public String roomStudent(){
    //     if (getSks() == 1) {
    //         return "ROOM 1";
    //     } else if (getSks() == 2) {
    //         return("ROOM 2" );
    //     } else if (getSks() == 3) {
    //         return("ROOM 3" );
    //     }
    //     return null;
    // }

    @Override
    public void courseName() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void sks() {
        // TODO Auto-generated method stub
        if (getSks() == 1) {
            System.out.println("SKS sebelumnya 70 SKS + Java (75 SKS) SKS Anda Sekarang: 145 SKS" );
        } else if (getSks() == 2) {
            System.out.println("SKS sebelumnya 70 SKS + JavaScript (65 SKS) SKS Anda Sekarang: 135 SKS" );
        } else if (getSks() == 3) {
            System.out.println("SKS sebelumnya 70 SKS + Python (55 SKS) SKS Anda Sekarang: 125 SKS" );
        }
        
    }

    @Override
    public void room() {
        // TODO Auto-generated method stub
        if (getSks() == 1) {
            System.out.println("ROOM 1" );
        } else if (getSks() == 2) {
            System.out.println("ROOM 2" );
        } else if (getSks() == 3) {
            System.out.println("ROOM 3" );
        }
    }

    
}
