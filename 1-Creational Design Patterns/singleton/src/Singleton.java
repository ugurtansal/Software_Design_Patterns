public class Singleton {
    private static Singleton instance;

    // Private constructor prevents instantiation from other classes
    private Singleton() {
        // Initialization code here
    }

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Example method
    public void doSomething() {
        System.out.println("Doing something!");
    }
}
