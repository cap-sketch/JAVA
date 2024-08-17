package unit3;
// Define a sealed class
sealed abstract class Vehicle permits Car, Bike {
    public abstract void start();
}

// Define a permitted subclass
final class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
}

// Define another permitted subclass
final class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }
}

public class Sealed_classes {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.start();
        myBike.start();
    }
}
