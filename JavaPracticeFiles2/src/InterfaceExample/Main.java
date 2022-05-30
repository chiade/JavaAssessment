package InterfaceExample;

public class Main {
    public static void main(String[] args) {
        Vehicle bicycle = new Bicycle(2, 3);
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);

        System.out.println("Bicycle present state :");
        System.out.println(bicycle);

    }
}
