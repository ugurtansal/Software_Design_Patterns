public class President extends Approver {
    @Override
    public void approveRequest(double amount) {

            System.out.println("President approved the request of amount: " + amount);
    }
}
