public abstract class Vehicle {
    public String brand;
    public String model;
    public String color;

    public Vehicle( String brand, String model,String color){
        this.brand=brand;
        this.model=model;
        this.color=color;
    }

    public Vehicle(Vehicle vehicle){
        this.brand=vehicle.brand;
        this.model=vehicle.model;
        this.color=vehicle.color;
    }
    public abstract Vehicle clone();
}
