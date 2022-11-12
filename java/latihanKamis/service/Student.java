package latihanKamis.service;

import latihanKamis.abstractClass.LearningPlan;

public class Student implements LearningPlan  {
    protected static int sks, mataKuliah;
    protected static String roomStudent;



    public Student(){
        
    }

    public Student(int sks, int mataKuliah, String roomStudent) {
        Student.sks = sks;
        Student.mataKuliah = mataKuliah;
        Student.roomStudent = roomStudent;


    }

    
    public static void setMataKuliah(int mataKuliah) {
        Student.mataKuliah = mataKuliah;
    }

    public static int getMataKuliah() {
        return Student.mataKuliah;
    }

    public void setSks(int sks){
        Student.sks = sks;
    }

    public int getSks(){
        return Student.sks;
    }


    public static void setRoomStudent(String roomStudent) {
        Student.roomStudent = roomStudent;
    }

    public static String getRoomStudent() {
        return roomStudent;
    }

    @Override
    public void courseName() {
        // TODO Auto-generated method stub
        System.out.println("test dri student");
        if (getMataKuliah() == 1) {
            System.out.println("Pilihan mata kuliah: Java" );
        } else if (getMataKuliah() == 2) {
            System.out.println("Pilihan mata kuliah: Javascript" );
        } else if (getMataKuliah() == 3) {
            System.out.println("Pilihan mata kuliah: Python" );
        }
        
    }

    @Override
    public void sks() {
        // TODO Auto-generated method stub
        System.out.println("test dri student");
        if (getMataKuliah() == 1) {
            System.out.println("SKS sebelumnya 70 SKS + Java (75 SKS). SKS Anda Sekarang: 145 SKS" );
        } else if (getMataKuliah() == 2) {
            System.out.println("SKS sebelumnya 70 SKS + JavaScript (65 SKS). SKS Anda Sekarang: 135 SKS" );
        } else if (getMataKuliah() == 3) {
            System.out.println("SKS sebelumnya 70 SKS + Python (55 SKS). SKS Anda Sekarang: 125 SKS" );
        }
        
    }

    @Override
    public void room() {
        // TODO Auto-generated method stub
        System.out.println("test dri student");
        if (getMataKuliah() == 1) {
            System.out.println("ROOM 1" );
        } else if (getMataKuliah() == 2) {
            System.out.println("ROOM 2" );
        } else if (getMataKuliah() == 3) {
            System.out.println("ROOM 3" );
        }
    }

    
}
