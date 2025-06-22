public class Director extends  Approver{
    @Override
    public void approveRequest(double amount) {
        if (amount <=10000) {
            System.out.println("Director approved the request of amount: " + amount);
        } else {
            if (nextApprover != null) {
                nextApprover.approveRequest(amount);
            } else {
                System.out.println("No one can approve the request of amount: " + amount);
            }
        }
    }
}
