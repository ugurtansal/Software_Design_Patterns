//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Singleton singleton = Singleton.getInstance();
            singleton.doSomething();
            Singleton singleton2 = Singleton.getInstance();
            singleton2.doSomething();

            if(singleton == singleton2) {
                System.out.println("Both instances are the same.");
            } else {
                System.out.println("Instances are different.");
            }
        }
    }
