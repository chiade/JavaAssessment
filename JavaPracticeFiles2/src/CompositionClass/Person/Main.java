package CompositionClass.Person;

public class Main {

    public static void main(String[] args) {

        //person - job composition example
        //2 pax: Jean, Jerry
        Person jean = new Person("Jean Looi", 23, 123, "FSD instructor", 1600);
        Person jerry = new Person("Jerry Lim", 30, 345, "FSD developer", 5000);

        System.out.println(jean);
        System.out.println(jerry);

        //create person or job, we use service - service layer
    }
}
