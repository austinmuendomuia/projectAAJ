import java.io.Serial;
import java.io.Serializable;
import java.sql.*;
import java.sql.Date;
import java.util.*;
public class student extends getactualgrade implements Person {
    protected int id;
    protected String Fname;
    protected String Lname;
    protected int Age;
    protected String Email;
    protected String Sex;
    protected Date DOB;
    protected int FacultyID;
    protected int courseID;



    public student(int id,String Fname,String Lname,int Age,String Email,String Sex, Date DOB,int FacultyID,int courseID) {
        this.id=id;
        this.Fname=Fname;
        this.Lname=Lname;
        this.Age=Age;
        this.Email=Email;
        this.DOB=DOB;
        this.FacultyID=FacultyID;
        this.courseID=courseID;

    }

    public String getFname() {
        return Fname;
    }
    public String getLname() {
        return Lname;
    }
    public int getAge() {
        return Age;
    }
    public String getEmail() {
        return Email;
    }
    public Date getDOB() {
        return DOB;
    }
    public int getFacultyID() {
        return FacultyID;
    }
    public int getID() {
        return id;
    }
    public String getSex() {
        return Sex;
    }
    public int getCourseID() {
        return courseID;
    }

    @Override
    public void displayPerson(String getFname, String getLname, int getAge, Serial getID, String getEmail, char getSex, java.util.Date getDOB, int facultyID) {
        System.out.println(getID+" "+getFname+" "+getLname+" "+getAge+" "+getDOB+" "+" "+getEmail+" "+getSex+" "+" "+facultyID+courseID);
        super.displayGrade();

    }
}