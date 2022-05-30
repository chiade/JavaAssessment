package InterfaceExample;

public class Bicycle implements Vehicle {

    private int _speed;
    private int _gear;

    public Bicycle(int speed, int gear) {
        this._speed = speed;
        this._gear = gear;
    }

    //implement the methods from Vehicle Interface
    @Override
    public void changeGear(int newGear) {

        this._gear = newGear;
    }
    // to increase speed
    @Override
    public void speedUp(int increment){

        this._speed = this._speed + increment;
    }

    // to decrease speed
    @Override
    public void applyBrakes(int decrement){

        this._speed = this._speed - decrement;
    }
    //public void turn() {    }

    @Override
    public String toString() {
        return String.format("Bicycle: speed: %d gear: %d", this._speed, this._gear);
    }

}
