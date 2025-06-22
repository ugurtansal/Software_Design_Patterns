public class Product {
    private String name;
    private double price;
    private DiscountStrategy discountStrategy;

    public Product(String name, double price, DiscountStrategy discountStrategy) {
        this.name = name;
        this.price = price;
        this.discountStrategy = discountStrategy;
    }

    public String getName() {
        return name;
    }

    void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscountedPrice() {

        return discountStrategy.applyDiscount(price);
    }

    public void printPrice() {
        System.out.println("Original price: " + price+ " USD | Discounted price: "+ getDiscountedPrice());
    }
}
