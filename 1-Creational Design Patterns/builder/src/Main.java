//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Director director1 = new Director(new TurkishBreakfastBuilder());
        Director director2 = new Director(new AmericanBreakfastBuilder());

        Breakfast turkishBreakfast = director1.prepareBreakfast();
        Breakfast americanBreakfast = director2.prepareBreakfast();

        System.out.println(turkishBreakfast.toString());
        System.out.println("--------------------------");
        System.out.println(americanBreakfast.toString());
    }
}