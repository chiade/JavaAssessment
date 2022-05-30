package InheritanceClass;

public class Main {

    public static void main(String[] args) {

        Manager jean = new Manager(111, "Jean Looi", 1600, 1, "Product Manager");
        Manager ernest = new Manager(222, "Ernest", 3200, 2, "Senior Product Manager");

        System.out.println(jean);
        System.out.println(ernest);

        Specialist john = new Specialist(333, "John Tan", 3500, 'A', "JFSD");
        Specialist jenny = new Specialist(444, "Jenny Tan", 5500, 'B', "Senior JFSD");

        System.out.println(john);
        System.out.println(jenny);


    }
}
