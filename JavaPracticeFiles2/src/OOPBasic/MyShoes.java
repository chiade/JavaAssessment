package OOPBasic;

//e.g. this Class Object will be used to map to our Database table and its fields
public class MyShoes {

    //Class attributes
    double size;
    String color;

    //Constructor overloading
    //Default Constructor
    public MyShoes() {
        this.size = 6;
        this.color = "black";
    }
    //Constructor - parameterized constructor (w parameters)
    public MyShoes(double size, String color) {
        //this refers to the instance that is created from other systems/Class
        this.size = size;
        this.color = color;
    }
    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    //Method Overriding - Object Class as toString() method, all Classes inherit from Object Class.
    //we are using the toString() method from the Object Class, and override it to return our own string format

    //one of the annotation provided by Java e.g. meta tag or tagging
    //Java annotation mainly used by Java compiler and JVM
    //SpringBoot use a lot of annotations
    @Override
    public String toString() {
        //"Shoes size " + boots.getSize() + " color " + boots.getColor()
        return String.format("Shoes size is %.1f, and the color is %s",this.getSize(),this.getColor());
    }

}  //End of the Class
