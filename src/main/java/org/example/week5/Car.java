package src.main.java.org.example.week5;

class Car extends Vehicle implements Repairable {
    private int adjustedLifespan = 150000;

    public Car(String modelName){
        super(modelName);
    }
    public Car(String modelName, int mileage, int health){
        super(modelName, mileage, health);
    }
    public String repair() {
        health = 100;
        if (lifespanReduced) {  // If lifespan was reduced, reset it to the original value
            adjustedLifespan = 150000;
            lifespanReduced = false;  // Reset the flag after repair
        }
        return "Engine tuned and oil changed for " + modelName;
    }

    @Override
    public String service(){
        return "Checking engine and changing oil for " +modelName + ", Mileage: " +mileage+ ", Health: " +health;
    }
    @Override
    public int expectedLifespan(){
        return adjustedLifespan;
    }
    boolean lifespanReduced = false;
    public void drive (int miles){
        health -= miles/100;
        mileage+=miles;
        if (health<30) {
            adjustedLifespan = adjustedLifespan - 10000;
            lifespanReduced = true;
            System.out.println("Warning: Health is below 30%. Reducing expected lifespan.");
        }
    }

    public void performMaintenance() {
        System.out.println(repair());
        System.out.println(service());

        drive(100);

    }
}
