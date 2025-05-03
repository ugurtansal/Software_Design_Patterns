//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehicle v1=new Bus("Mercedes","Travego","Black",55);
        Vehicle v2=new Car("mercedes","E600","White",200);

        Vehicle b2=v1.clone();
        Vehicle c2=v2.clone();
        System.out.println(b2.brand);
        System.out.println(c2.model);
    }
}