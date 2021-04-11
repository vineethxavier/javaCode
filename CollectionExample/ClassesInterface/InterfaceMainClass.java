package CollectionExample.ClassesInterface;

import java.sql.SQLOutput;

public class InterfaceMainClass {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();

        bike.getDefaultBodyFromInterface();

        System.out.println("\nCar wheels = " + car.getNumberOfWheels());
        System.out.println("Car Color = " + car.getVehicleColor());

        System.out.println("\nBike wheels = " + bike.getNumberOfWheels());
        System.out.println("Bike Color = " + bike.getVehicleColor());

    }
}

interface Vehicles{
    final static String purpose = "Purpose is for Transportation";
    public abstract int getNumberOfWheels();
    public abstract String getVehicleColor();
    public int driver = 0;
    public default void getDefaultBodyFromInterface(){
        System.out.println("=== this is default block from java 8 in Interface ===");
        System.out.println("An interface in Java is similar to class but, it contains only abstract methods and fields which are final and static. \n==== ");
    }
}

class Car implements Vehicles{

    @Override
    public int getNumberOfWheels() {
        return 4;
    }

    @Override
    public String getVehicleColor() {
        return "Red";
    }
}

class Bike implements Vehicles{

    @Override
    public int getNumberOfWheels() {
        return 2;
    }

    @Override
    public String getVehicleColor() {
        return "Black";
    }
}
