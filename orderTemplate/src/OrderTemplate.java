public abstract class OrderTemplate {

    public final void orderProcess() {
        takeOrder();
        prepareOrder();
        bakeOrder();
        deliverOrder();
    }


    private void takeOrder() {
        System.out.println("Taking order...");
    }



    private void bakeOrder() {
        System.out.println("Baking order...");
    }
    private void deliverOrder() {
        System.out.println("Delivering order...");
    }

    protected abstract void prepareOrder();




}
