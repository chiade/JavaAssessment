package CompositionClass.Person;

//Composition Relationship Example
//A person has a job - 1-to-1 relationship
//One person has only 1 job

public class Person {

    //person will have its own attributes
    private String name;
    private int age;

    //Has an attribute of the composite Class e.g. job
    private Job job;    //Job is the Class name; job is the instance

    //Constructor - need to have the parameter of peron's attribute (name, age) and also the job attribute (id, role, salary)

    public Person(String name, int age, int id, String role, double salary) {

        //Part 1 - person's attribute e.g. name, age
        this.name = name;
        this.age= age;

        //Part 2 - create the job for this person
        //e.g. Jean is a person, is FS teacher with $1600
        //create new instance of Job object, automatically calls the Job Constructor
        this.job = new Job(id, role, salary);

    }
    //Getter and setter methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return String.format("Name is %s, and age is %d years old.", this.name, this.age) + this.job;
    }
}
