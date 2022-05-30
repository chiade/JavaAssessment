package CompositionClass.CourseService;

public class Main {

    public static void main(String[] args) {

        //Create instance of CourseService - service layer
        CourseService courseService = new CourseService();
        System.out.println(courseService);

        //Add course
        //New course: id:"java1" name: "Introduction to Java1 credit: 8
        courseService.addCourse("java01", "Introduction to Java1", 8);
        System.out.println(courseService);

        //Find course - id: java01
        Course getCourse = courseService.findCourse("java01");

        if (getCourse != null) {
            System.out.println("Course found! \n" + getCourse);
        } else {
            System.out.println("Course not found. Try again!");
        }

        courseService.addStudent("desmond", "s1875621");
        System.out.println(courseService);
        courseService.enrollCourseToStudent("S1234567B", "java01");
        System.out.println(courseService);
        courseService.displayStudentInformation("S1234567B");
        System.out.println(courseService);
        courseService.totalEnrolledCourse("S1234567B");
        System.out.println(courseService);
    }
}
