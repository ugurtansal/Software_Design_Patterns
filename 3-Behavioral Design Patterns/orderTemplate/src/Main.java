//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("=== 🍔 Burger Order Process ===");
        OrderTemplate burger = new BurgerOrder();
        burger.orderProcess();

        System.out.println("\n=== 🍕 Pizza Order Process ===");
        OrderTemplate pizza = new PizzaOrder();
        pizza.orderProcess();
    }
}