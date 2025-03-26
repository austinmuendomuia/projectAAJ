public class getactualgrade extends grade{

    @Override
    public double calculateaverage(double a, double b, double c, double d, double e, double f, double g, double h) {
        double sum=a+b+c+d+e+f+g+h;
        return sum/8;
    }

    @Override
    public double calculateaverage(double a, double b, double c, double d, double e, double f, double g) {
        double sum=a+b+c+d+e+f+g;
        return sum/7;
    }

    @Override
    public double calculateaverage(double a, double b, double c, double d, double e, double f) {
        double sum=a+b+c+d+e+f;
        return sum/6;
    }

    @Override
    public double calculateaverage(double a, double b, double c, double d, double e) {
        double sum=a+b+c+d+e;
        return sum/5;
    }
    @Override
    public String getGrade(double average) {
        if (average >= 70) {
            return "A";
        }
        else if (average >= 60) {
            return "B";
        }
        else if (average >= 50) {
            return "C";
        }
        else if (average >= 40) {
            return "D";
        }
        else{
            return "FAIL";
        }
    }
    @Override
    public void displayaveragemks(double a, double b, double c, double d, double e, double f, double g, double h){

        super.displayaveragemks(a,b,c,d,e,f,g,h);
        System.out.println(grade);
    }
    public void displayGrade(){
        super.displayGrade();
    }
}
