package CompositionClass.Person;

public class Job {

    private String role;
    private double salary;
    private int id;

    public Job(int id, String role, double salary)
    {
        this.id = id;
        this.role = role;
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("Job role is %s, and the salary is $%.2f", this.role, this.salary);
    }

}
