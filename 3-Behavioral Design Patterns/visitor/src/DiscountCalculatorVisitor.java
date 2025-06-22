public class DiscountCalculatorVisitor implements ProductVisitor{
    @Override
    public void visit(Book book) {
        double discount = book.getPrice() >30? book.getPrice()*0.05: 0;
        System.out.printf("Book: %s - Discount: $%.2f\n", book.getTitle(), discount);
    }

    @Override
    public void visit(Electronics electronics) {
        System.out.println("Electronics: " + electronics.getName() + " - Discount: $0,00 (No Discount)");

    }

    @Override
    public void visit(Clothing clothing) {

        double discount = clothing.getPrice() > 200 ? clothing.getPrice() * 0.15 : 0;
        System.out.printf("Clothing: %s - Discount: $%.2f\n", clothing.getBrand(), discount);
    }
}
