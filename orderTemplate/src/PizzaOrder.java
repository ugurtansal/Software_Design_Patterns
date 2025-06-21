public class PizzaOrder extends OrderTemplate{
    @Override
    protected void prepareOrder() {
        System.out.println("Preparing pizza order...");
    }
}
