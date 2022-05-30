package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    private String id; //declare class attributes
    private String name;
    private String email;
    private Date birthDate;

    public StudentService() {
        //declare constructor
        Student jean = new Student("A111", "Jean", "jean@gmail.com", 10/10/2010);
        Student desmond = new Student("A112", "Desmond", "desmond@gmail.com", 12/10/2012);
        students.put(jean.getId(), jean);
        students.put(desmond.getId(), desmond);
    }

    public void subscribeStudent( Student student )
    {
        //TODO
        Student newStudent = new Student(id, name, email, birthDate);
        students.put(id, newStudent);

    }
    public Student findStudent( String studentId )
    {
        //TODO
        if (students.containsKey(studentId)) {
            return students.get(studentId);
        }
        return null;
    }

    public boolean showSummary()
    {
        //TODO
        System.out.println( "Students:" );
        for ( String key : students.keySet() )
        {
            System.out.println(key + students.get(key));
        }
        return false;
    }

    public void enrollToCourse( String studentId, Course course )
    {
        //TODO
        if (students.get(studentId) == null) {
            System.out.println("Enroll Failed. Student could not be found.");
        }
        else if (course.getCode() == null) {
            System.out.println("Enroll Failed. Course could not be found.");
        }
    }
}
