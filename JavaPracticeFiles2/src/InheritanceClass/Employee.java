package InheritanceClass;

public class Employee {

    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary)
    {
        this.id= id;
        this.name= name;
        this.salary = salary;
    }
    //public Employee(String name, double salary) {
    //  this(100, name, salary);
    //}

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected double getSalary() {
        return salary;
    }

    protected void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Employee ID: %d, Name: %s, Salary:%.2f", this.id, this.name, this.salary);
    }
}
