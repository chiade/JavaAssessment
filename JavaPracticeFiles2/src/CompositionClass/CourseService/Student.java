package CompositionClass.CourseService;

import java.util.ArrayList;

public class Student {

    private String name;
    private String id;

    //Course is enrolled by the student e.g. Jean registered online Coursea. A list of courses shown for her to choose. Jean searched for Java course and enrolled.
    //also enrolled for CSS course. Jean as a student has 2 enrolled courses (Java, CSS)
    //A student can have many enrolled courses. hence student needs to keep track of his enrolled courses
    //Jean access her dashboard and knows how many courses enrolled
    //In Student Class, need a collection (i.e. ArrayList) to keep track of the number of enrolled courses for the student

    private ArrayList<Course> enrolledCourses;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;

        //Create an empty enrolledCourses ArrayList
        enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void enroll(Course course) {
    //todo - add the course to the ArrayList
        enrolledCourses.add(course);
    }

    public void unEnroll(Course course) {
        //todo - remove the course to the ArrayList
        enrolledCourses.remove(course);
    }

    public int totalEnrollmentCourses()
    {   //todo - return length of the ArrayList
        return enrolledCourses.size();
    }
    public ArrayList<Course> getEnrolledCourses()
    {  //todo - return the while ArrayList

        return enrolledCourses;
    }

    @Override
    public String toString() {
        return String.format("Student ID: %s, student name: %s. Enrolled courses: ", this.id, this.name) + this.enrolledCourses;
    }

}
