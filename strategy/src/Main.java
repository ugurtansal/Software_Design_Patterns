public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 15000, new PercentageDiscount(10));
        Product phone = new Product("Telefon", 8000, new FixedDiscount(500));
        Product book = new Product("Kitap", 100, new NoDiscount());

        laptop.printPrice(); // %10 discount
        phone.printPrice();  // 500₺ discount
        book.printPrice();   // No discount

        // Dinamik strateji değişikliği
        book.setDiscountStrategy(new PercentageDiscount(50));
        System.out.println("Book price after changing discount strategy:");
        book.printPrice();
    }
}
