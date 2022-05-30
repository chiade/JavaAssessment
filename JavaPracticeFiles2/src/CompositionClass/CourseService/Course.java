package CompositionClass.CourseService;

public class Course {

    private String name;
    private String id;
    private int credit;

    public Course(String id, String name, int credit)
    {
        this.id = id;
        this.name = name;
        this.credit = credit;
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

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return String.format("Course id: %s, course name: %s, course credit: %d", this.id, this.name, this.credit);
    }
}
