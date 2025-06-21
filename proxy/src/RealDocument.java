public class RealDocument implements Document {
    @Override
    public void display() {
        System.out.println("Displaying real document");
    }

    public void load() {
        System.out.println("Loading real document");
    }

    public void save() {
        System.out.println("Saving real document");
    }

    public void close() {
        System.out.println("Closing real document");
    }


}
