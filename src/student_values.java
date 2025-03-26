//import java.sql.Connection;
//import java.sql.Statement;
//import java.util.*;
//public class student_values {
//    public static void main(String[]args){
//        Connection connection=null;
//        Statement statement=null;
//
//        jdbcconnector jdbcconnector=new jdbcconnector();
//        connection=jdbcconnector.get_connection();
//
//        try{
//            String sql="insert into student(student_id,fname,lname,dob,emailaddress,sex) VALUES(?,?,?,?,?,?)";
//
//
//            statement = connection.createStatement();
//            statement.executeUpdate(sql);
//           System.out.print("Studentvaluescreated");
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//
//    }
//}
