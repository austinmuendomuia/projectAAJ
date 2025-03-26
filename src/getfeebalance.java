public class getfeebalance implements feebalance {

    public double getFeebalance(double totalfees,double paid) {
        return totalfees-paid;
    }
    public void displayFeebalance(double totalfees,double paid) {
        double balance=getFeebalance(totalfees,paid);
        System.out.println(balance);
    }
}
