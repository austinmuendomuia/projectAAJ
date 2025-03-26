public class getTcredits implements Tcredits {
    double creditFactor=0.5;

    @Override
    public double calculateTcredits(double creditFactor, int attendanceCount){
        return creditFactor * attendanceCount;
    }
    @Override
    public void displayTcredits(double creditFactor, int attendanceCount){
        double credits = calculateTcredits(creditFactor, attendanceCount);
        System.out.println(credits);
    }

}
