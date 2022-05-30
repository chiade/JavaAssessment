package InheritanceClass;

public class Manager extends Employee {

    private int roleLevel;
    private String roleDescription;

    //take in value for Manager Object's attribute as well as the parent's object attributes
    public Manager(int id, String name, double salary, int roleLevel, String roleDescription)
    {
        //Manager's parent's attributes
        //Constructor chaining - chain your parent's constructor (not use THIS like in bank a/c)
        super(id, name, salary);

        //Manager object's own attribute
        this.roleLevel = roleLevel;
        this.roleDescription = roleDescription;
    }
    //getter and setter - no need to create for parent's attributes

    public int getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(int roleLevel) {
        this.roleLevel = roleLevel;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    @Override
    public String toString() {
        //id, name, salary, roleLevel, rolDescription
        return super.toString() + String.format(" role level: %d, role description: %s", this.roleLevel, this.roleDescription);
    }
}
