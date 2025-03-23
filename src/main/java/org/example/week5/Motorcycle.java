package src.main.java.org.example.week5;

public class Motorcycle extends Vehicle{
    int adjustedLifespan=50000;
    public Motorcycle(String modelName) {
        super(modelName);
    }
    public Motorcycle(String modelName, int mileage, int health) {
        super(modelName, mileage, health);
    }
    @Override
    public String service(){
        return "Chain lubricated, engined tuned for "+ modelName+" with a mileage "+ mileage+ " and health of"+health;
    }
    @Override
    public int expectedLifespan(){
        return adjustedLifespan;
    }
    public void setExpectedLifespan(int adjustedLifespan) {
        this.adjustedLifespan = adjustedLifespan;
    }
    public void race (int raceMiles){
        mileage += raceMiles;
        health -= raceMiles/100;
        System.out.println("Racing " + raceMiles + " miles with " + getModelName() +
                ", New Mileage: " + mileage + ", New Health: " + health);
        if (health<40){
            System.out.println("Warning: Health is below 40%. Reducing expected lifespan.");
            //setExpectedLifespan(expectedLifespan()-5000);
            setExpectedLifespan(adjustedLifespan - 5000);
        }
    }
    public void performMaintenance(){
        System.out.println("Performing maintenance on " + getModelName() + ":");
        System.out.println(" - Tuning engine and lubricating chain.");
        System.out.println("Maintenance complete. Health restored to " + health + ".");
        race(1000);
        health = 100;
        System.out.println("Maintenance complete. Health restored to " + health + ".");

    }
}
