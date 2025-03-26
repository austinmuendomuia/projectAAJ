public abstract class grade implements avgmarks {
    protected String grade;

    public void displayaveragemks(double a, double b, double c, double d, double e, double f, double g, double h){
        double average=calculateaverage(a,b,c,d,e,f,g,h);
        average=calculateaverage(a,b,c,d,e,f,g);
        average=calculateaverage(a,b,c,d,e,f);
        average=calculateaverage(a,b,c,d,e);

        String grade=getGrade(average);
        System.out.println(average);
    }

    public abstract String getGrade(double average);

        public void displayGrade() {
        System.out.println(grade);
    }
}

//when we make a class to insert values make it such that the class will extend this abstract class to get the grade and implement the interface