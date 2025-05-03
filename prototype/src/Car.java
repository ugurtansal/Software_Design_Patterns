public class Car extends Vehicle{
    public int topSpeed;

    public Car(String brand, String model,String color,int topSpeed) {
        super(brand, model, color);
        this.topSpeed = topSpeed;
    }

    public Car(Car car) {
        super(car);
        this.topSpeed = car.topSpeed;
    }
    @Override
    public Vehicle clone() {
        return new Car(this);
    }
}
