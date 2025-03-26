import java.sql.*;
import java.sql.Date;
import java.util.*;
import java.time.*;
import java.io.Serial;
public class studentsql extends student{
    public studentsql(int id, String Fname, String Lname, int Age, String Email, String Sex, Date DOB, int FacultyID, int courseID) {
        super(id, Fname, Lname, Age, Email, Sex, DOB, FacultyID, courseID);
    }

    public List<student> getStudents(){
        List<student> students = new ArrayList<>();
        String query= "select * from student";

        try {
            Connection conn = jdbcconnector.get_connection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {

                        int id=rs.getInt("id");
                        String Fname=rs.getString("First_Name");
                       String Lname= rs.getString("Last_Name");
                        int Age=rs.getInt("Age");
                        String Sex=rs.getString("Sex(gender)");
                        int FacultyID=rs.getInt("FacultyID");
                        String email=rs.getString("Email");
                        int courseID=rs.getInt("CourseID");
                        Date sqlDate=rs.getDate("DOB");
                        LocalDate sqlDate1=sqlDate.toLocalDate();

                        student student=new student(id,Fname,Lname,Age,Email,Sex,DOB,FacultyID,courseID);
                students.add(student);
            }
        }
        catch(Exception e){
            e.printStackTrace();

        }
        return students;

    }
    public void addstudents(student student){
        String query="INSERT INTO student(Fname,Lname,Age,Email,Sex,DOB,FacultyID,courseID) VALUES(?,?,?,?,?,?,?,?,?)";

        try{
            Connection conn = jdbcconnector.get_connection();
            PreparedStatement statemnt=conn.prepareStatement(query);


            statemnt.setString(1,student.getFname());
            statemnt.setString(2,student.getLname());
            statemnt.setInt(3,student.getAge());
            statemnt.setString(4,student.getEmail());
            statemnt.setString(5,student.getSex());
            statemnt.setDate(6,student.getDOB());
            statemnt.setInt(7,student.getFacultyID());
            statemnt.setInt(8,student.getCourseID());

            statemnt.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void updatestudents(student student){
        String query="UPDATE student SET Fname=?,Lname=?,Age=?,Email=?,Sex=?,DOB=?,FacultyID=?,CourseID=? WHERE id=?";

        try{
            Connection conn = jdbcconnector.get_connection();
            PreparedStatement statmnt= conn.prepareStatement(query);

            statmnt.setString(1,student.getFname());
            statmnt.setString(2,student.getLname());
            statmnt.setInt(3,student.getAge());
            statmnt.setString(4,student.getEmail());
            statmnt.setString(5,student.getSex());
            statmnt.setDate(6,student.getDOB());
            statmnt.setInt(7,student.getFacultyID());
            statmnt.setInt(8,student.getCourseID());
            statmnt.setInt(9,student.getID());

            statmnt.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void deletestudents(student student){
        String query="DELETE FROM student WHERE id=?";

        try{
            Connection conn = jdbcconnector.get_connection();
            PreparedStatement statemnt=conn.prepareStatement(query);

            statemnt.setInt(1,id);
            statemnt.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}