public class Manager extends Approver {


    @Override
    public void approveRequest(double amount) {
        if (amount <=1000) {
            System.out.println("Manager approved the request of amount: " + amount);
        } else {
            if (nextApprover != null) {
                nextApprover.approveRequest(amount);
            } else {
                System.out.println("No one can approve the request of amount: " + amount);
            }
        }
    }
}
