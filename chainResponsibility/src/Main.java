//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Approver manager = new Manager();
        Approver director = new Director();
        Approver president = new President();
        Approver vicePresident = new VicePresident();

        manager.setNextApprover(director);
        director.setNextApprover(vicePresident);
        vicePresident.setNextApprover(president);

        manager.approveRequest(500);
        manager.approveRequest(7500);
        manager.approveRequest(20000);
        manager.approveRequest(100000);

    }
}