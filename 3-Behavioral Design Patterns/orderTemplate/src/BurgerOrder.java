public class BurgerOrder extends OrderTemplate {
    @Override
    protected void prepareOrder() {
        System.out.println("Preparing burger order...");
    }
}
