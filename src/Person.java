import java.io.Serial;
import java.util.Date;


public interface Person {
    String getFname();
    String  getLname();
    int  getAge();
    int getID();
    String getEmail();
    String getSex();
    Date getDOB();
    int getFacultyID();

     abstract void displayPerson(String getFname, String getLname,int getAge,Serial getID, String getEmail,char getSex,Date getDOB,int facultyID);

}
