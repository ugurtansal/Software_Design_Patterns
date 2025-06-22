public class PizzaFactory {
    public static IPizza orderPizza(String type) {
        IPizza pizza;
        switch (type.toLowerCase()) {
            case "veggie":
                pizza = new Veggie();
                pizza.prepare();
                return pizza;
            case "margherita":
                pizza = new Margherita();
                pizza.prepare();
                return pizza;
            case "pepperoni":
                pizza = new Pepperoni();
                pizza.prepare();
                return pizza;
            default:
                throw new IllegalArgumentException("Unknown pizza type: " + type);
        }
    }
}
