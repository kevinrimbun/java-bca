package latihanKamisV2.model;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private List<Integer> sks = new ArrayList<>();
    private List<String> room = new ArrayList<>();
    private List<String> courseName = new ArrayList<>();


    public Student(){

    }


    public Student(List<Integer> sks, List<String> room, List<String> courseName) {
        this.sks = sks;
        this.room = room;
        this.courseName = courseName;
    }


    public Student(String firstName, String lastName, String domicile, List<Integer> sks, List<String> room, List<String> courseName) {
        super(firstName, lastName, domicile);
        this.sks = sks;
        this.room = room;
        this.courseName = courseName;
    }


    public List<Integer> getSks() {
        return sks;
    }


    public void setSks(int sks) {
        this.sks.add(sks);
    }


    public List<String> getRoom() {
        return room;
    }


    public void setRoom(String room) {
        this.room.add(room);
    }


    public List<String> getCourseName() {
        return courseName;
    }


    public void setCourseName(String courseName) {
        this.courseName.add(courseName);
    }
}
