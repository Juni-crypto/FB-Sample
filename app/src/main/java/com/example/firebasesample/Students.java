package com.example.firebasesample;

/**
 * Created by Hilal Ahmad
 * Date: 27-July-2020
 * Time: 12:28 AM
 */
public class Students {

    String id;
    String name;
    String rollno;
    String course;

    public Students() {
    }

    public Students(String id,String name, String rollno, String course) {
        this.id = id;
        this.name = name;
        this.rollno = rollno;
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRollno() {
        return rollno;
    }

    public String getCourse() {
        return course;
    }
}
