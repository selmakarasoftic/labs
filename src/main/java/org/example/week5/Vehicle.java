package src.main.java.org.example.week5;

abstract class Vehicle{
    public String modelName;
    public  int mileage;
    public int health;

    public Vehicle(String modelName) {
        this.modelName = modelName;
        this.mileage = 0;
        this.health = 100;
    }
    public Vehicle(String modelName, int mileage, int health) {
        this.modelName = modelName;
        this.mileage = mileage;
        this.health = health;
    }
    public String getModelName() {
        return modelName;
    }
    public int getMileage() {
        return mileage;
    }
    public int getHealth() {
        return health;
    }

    public abstract int expectedLifespan();
    public abstract String service();

    public boolean needsMaintenance(){
        return health<70;
    }

    public int calculateRemainingLifespan() {
        int remainingLifespan = expectedLifespan()-mileage;
        if (health < 50) {
            remainingLifespan -= (expectedLifespan() * (100 - health)) / 100;
        }
        return remainingLifespan;
    }

    public void simulateYear(){
            if(mileage>expectedLifespan()/2){
                health-=5;
            }
            int remainingLifespan = calculateRemainingLifespan();
    }
    public void performMaintenance(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            Car car = (Car) vehicle;
            car.performMaintenance();
        } else if (vehicle instanceof Truck) {
            Truck truck = (Truck) vehicle;
            truck.performMaintenance();
        } else if (vehicle instanceof Motorcycle) {
            Motorcycle motorcycle = (Motorcycle) vehicle;
            motorcycle.performMaintenance();
        }
    }
}


