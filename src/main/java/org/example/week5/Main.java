package src.main.java.org.example.week5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Audi"));
        vehicles.add(new Truck("Pickup"));
        vehicles.add(new Motorcycle("Yamaha"));

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.service());

            vehicle.simulateYear();

            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                car.drive(200);
                System.out.println("After driving, " + car.getModelName() + " - Mileage: " + car.getMileage() + ", Health: " + car.getHealth());
            } else if (vehicle instanceof Truck) {
                Truck truck = (Truck) vehicle;
                truck.haul(600);
                System.out.println("After hauling, " + truck.getModelName() + " - Mileage: " + truck.getMileage() + ", Health: " + truck.getHealth());
            } else if (vehicle instanceof Motorcycle) {
                Motorcycle motorcycle = (Motorcycle) vehicle;
                motorcycle.race(3550);
                System.out.println("After racing, " + motorcycle.getModelName() + " - Mileage: " + motorcycle.getMileage() + ", Health: " + motorcycle.getHealth());
            }
            vehicle.performMaintenance(vehicle);
            System.out.println();
        }

    }
}
