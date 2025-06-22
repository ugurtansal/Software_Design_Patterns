import java.util.HashMap;

public class StockNewsService implements StockObserver{
    private final HashMap<String, Double> observers = new HashMap<>();

    @Override
    public void update(String symbol, double price) {

        double currentPrice =observers.getOrDefault(symbol, 0.0);
        double diff =  Math.abs( currentPrice- price);
        if (diff >= 5.0) {
            System.out.printf("NEWS: Breaking! %s moved $%.2f to $%.2f\n", symbol, diff, price);
            
        }
        observers.put(symbol, price);
    }
}
