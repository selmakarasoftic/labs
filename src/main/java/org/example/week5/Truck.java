package src.main.java.org.example.week5;

public class Truck extends Vehicle implements Repairable{
    public Truck(String modelName) {
        super(modelName);
    }
    public Truck(String modelName, int mileage, int health) {
        super(modelName, mileage, health);
    }
    public String repair() {
        health = 100;
        if (lifespanReduced) {
            adjustedLifespan = 30000;
            lifespanReduced = false;
        }
        return "Engine overhauled and tires replaced for " + getModelName();
    }
    @Override
    public String service(){
        return "Checking engine and changing oil for " + getModelName() + ", Mileage: " + getMileage() + ", Health: " + getHealth();
    }
    int adjustedLifespan=30000;
    @Override
    public int expectedLifespan(){
        return adjustedLifespan;
    }
boolean lifespanReduced=false;
    public void haul(int loadWeight){
        mileage+=50;
        if (loadWeight > 5000){
            health-=10;
            System.out.println("Hauling " + loadWeight + " pounds with " + getModelName() +
                    ", New Mileage: " + getMileage() + ", New Health: " + getHealth());
        }
        if (health<50){
            System.out.println("Warning: Health is low after hauling. Reducing remaining lifespan by 20000 miles.");
            adjustedLifespan -= 20000;
            lifespanReduced = true;
        }
    }
    public void performMaintenance() {
        haul(6000);
        System.out.println(repair());
    }
}
