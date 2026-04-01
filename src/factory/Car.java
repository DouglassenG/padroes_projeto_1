public class Car {

    private int horsePower;
    private String fuelSource;
    private String color; 

    public Car(int horsePower, String fuelSource, String color) {
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }

    public void startEngine() {
        System.out.println("Starting the engine...");
    }

    public void clean() {
        System.out.println("Cleaning the car...");
    }
    public void mechanicCheck() {
        System.out.println("Performing mechanic check...");
    }
    public void fuelCar() {
        System.out.println("Fueling up the car...");
    }

}
