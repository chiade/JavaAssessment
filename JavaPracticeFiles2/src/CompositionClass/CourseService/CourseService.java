package CompositionClass.CourseService;

import java.util.ArrayList;
import java.util.HashMap;

public class CourseService {

    private HashMap<String, Course> courses;
    private HashMap<String, Student> students;

    public String id;
    public String name;
    public int credit;

    public CourseService() {

        //create 3 course
        Course java = new Course("java1", "Intro to Java", 5);
        Course css = new Course("css1", "Intro to CSS", 4);
        Course html = new Course("html1", "Intro to HTML", 3);

        //HashMap
        courses = new HashMap<>();
        //courses.put("java1", {id:java1, name:Intro to Java, credit:5});
        //courses.put(String, Course)
        courses.put(java.getId(), java);
        courses.put(css.getId(), css);
        courses.put(html.getId(), html);

        //create 3 students
        Student jean = new Student("Jean Looi", "S1234567A");
        Student john = new Student("John Looi", "S1234567B");
        Student jen = new Student("Jen Looi", "S1234567C");

        students = new HashMap<>();
        students.put(jean.getId(), jean);
        students.put(john.getId(), john);
        students.put(jen.getId(), jen);
        }
        public void addCourse(String id, String name, int credit)
        {   //Add a new course to the courses HashMap
            //New course: id:"java1" name: "Introduction to Java1 credit: 8
            //0) Check if the new
            //1) create a new instance of Course Object
            //2) Add the new instance into the courses HashMap using put() method

            Course newCourse = new Course(id, name, credit);
            courses.put(id, newCourse);
        }
        public HashMap<String, Course> getCourse()
        {
            //return all the courses to caller
            return courses;
        }
        public Course findCourse(String id)
        {
            //Get the course ID from the caller and return Course Object
            //e.g. parameter passed in id: java01
            //return {id:"java1" name: "Introduction to Java1 credit: 8}

            //1) Check if id that passed in exist in the HashMap
            //2) Get the course object from the courses HashMap using id (key)
            //3) Return the course object to the caller

            if (courses.containsKey(id))    //return true or false
            {   //if true
                return courses.get(id);
            }
            //if false
            return null;
        }
        public void addStudent(String id, String name)
        {
            Student newStudent = new Student(id, name);
            students.put(id, newStudent);
        }
        public void enrollCourseToStudent(String studentId, String courseId) {
            // todo - enroll the course to the student with the course Id, and student id
            // that passed in as parameters. add the course to the student's enrolledCourses ArrayList
            if(students.get(studentId)==null){
                   System.out.println("Enroll Failed. Student could not be found.");
                }
               else if(courses.get(courseId)==null){
                   System.out.println("Enroll Failed. Course could not be found.");
               }
                else {
            //          //Get that particular student object: id with 111
            //          //key to the HashMap to find that student
                        Student student = students.get(studentId);
            //          //Get the course object: id with java01
                        Course course = courses.get(courseId); // {"java01", "intro to Java", 8}

                        //enroll the course to the student, need to add course object to the ArrayList from the student Object
                        //student.enrolledCourses.add(); - CANNOT DO SO!

                        student.enroll(course);
            }
        }
        public void unEnrollCourseFromStudent(String studentId, String courseId)
        {
           // todo - unenroll the course to the student with the course Id, and student id
            // that passed in as parameters. remove the course to the student's enrolledCourses ArrayList
            if (students.containsKey(studentId))
            {
                students.get(studentId).unEnroll(courses.get(courseId));
            }
        }
        public Student displayStudentInformation(String studentId)
        {
            //todo - return student's details w the student ID passes in from the parameter
            //Student searchResult = students.get(studentId);
            //if (searchResult != null) {
                    //  return searchResult;
            //}
            //return null;

            if (students.containsKey(studentId))
            {
                return students.get(studentId);
            }
            return null;
        }
        public int totalEnrolledCourse(String studentId)
        {   //todo - return the number of enrolled courses from a student w the student ID passed in from the parameter
            if (students.containsKey(studentId))
            {   //student might exist but student might not have any enrolled course
                //so 0 is a valid answer as well ie.. 0, 1, 2, 3, 4, 5,
                return students.get(studentId).totalEnrollmentCourses();
            }
            return -1;
            //Travel Reservation form JS
            //Array indexOf() - either index of element or -1 if element cannot be found
        }
        public int totalCredit(String studentId)
        {   //todo - return the total credit of a student w the student ID passes in from the parameter
            //student object {name, id}
            Student student = students.get(studentId);
            //ArrayList created will contain all enrolled courses of that student
            ArrayList<Course> studentTotalCourses = student.getEnrolledCourses();
            //for each element in the studentTotalCourses, i want to get credit
            int totalCredit = 0;
            for (Course course : studentTotalCourses) {
                totalCredit += course.getCredit() ;
            }
            return totalCredit;
            }

        @Override
        public String toString() {
            String courseTitle = "Courses offered from Jean's Learning Center:\n";
            String studentTitle = "\nStudents registered to Jean's Learning Center:\n";

            String printAllCourses = "";
            String printAllStudents = "";

            for (Course c: courses.values())
            {
                printAllCourses += c + "\n";
            }
            for (Student s: students.values())
            {
                printAllStudents += s + "\n";
            }
            return courseTitle + printAllCourses + studentTitle + printAllStudents;
    }

}
