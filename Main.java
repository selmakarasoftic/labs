enum Manufacturer{
    BMW,
    VW,
    AUDI

}

class Component{
    private String name;
    private int serialNumber;
    private Manufacturer manufacturer;

    Component(String name, int serialNumber, Manufacturer manufacturer){
        this.name = name;
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSerialNumber(int serialNumber){

        this.serialNumber = serialNumber;
    }


    public void setManufacturer(Manufacturer manufacturer){
        this.manufacturer = manufacturer;
    }


    public String getName(){
        return name;
    }

    public int getSerialNumber(){
        return serialNumber;
    }

    public Manufacturer getManufacturer(){
        return manufacturer;

    }

    public String whichComponentAml(){
        return "Component";
    }
}

class Wheel extends Component{
    private int diameter;

    Wheel(String name, int serialNumber, Manufacturer manufacturer, int diameter){
        super(name, serialNumber, manufacturer);
        this.diameter = diameter;
    }

    public void setDiameter(int diameter){
        this.diameter = diameter;
    }

    public int getDiameter(){
        return diameter;
    }

    @Override
    public String whichComponentAml(){
        return "Wheel";
    }
}

class Gearbox extends Component{
    private int numOfGears;

    Gearbox(String name, int serialNumber, Manufacturer manufacturer, int numOfGears){
        super(name, serialNumber, manufacturer);
        this.numOfGears = numOfGears;
    }

    public void setNumOfGears(int numOfGears){
        this.numOfGears = numOfGears;
    }

    public int getNumOfGears(){
        return numOfGears;
    }

    @Override
    public String whichComponentAml(){
        return "Gearbox";
    }

}


public class Main {
    public static void main(String[] args) {

    }
}