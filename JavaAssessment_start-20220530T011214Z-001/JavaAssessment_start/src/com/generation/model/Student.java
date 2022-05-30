package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Student extends Person
    implements Evaluation
{
    //declare class attributes
    float PASS_MIN_GRADE = 3.0f;
    double average;
    public String id;
    public String name;
    public String email;
    public Date birthDate;
    public String courseId;

    public ArrayList<Course> enrolledCourses; // declare ArrayList to store enrolled courses
    public ArrayList<Course> courses;

    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
        //declare constructor
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;

        enrolledCourses = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void enrollToCourse( Course course )
    {
        //TODO
        enrolledCourses.add(course);
    }

    @Override
    public List<Course> findPassedCourses()
    {
        //TODO
        Scanner getGrade = new Scanner(System.in);
        System.out.println("Enter your grade (1-6): ");
        int grade = getGrade.nextInt();

        if (grade > 0 || grade <=2 ) {
            System.out.println("Your grade is: " + grade + "You have failed!" + this.enrolledCourses);
        } else if (grade >=3 || grade <= 6) {
            System.out.println("Your grade is: " + grade + "You have passed!" + this.enrolledCourses);
        } else {
            System.out.println("Not valid grades.");
        }
        return null;
    }

    public Course findCourseById( String courseId )
    {
        //TODO
        if (courses.containsKey(courseId)) {
            return courses.get(courseId);
        }
       return null;
    }

    @Override
    public List<Course> getEnrolledCourses()
    {
        //TODO
        return enrolledCourses;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }
}
