import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
public class jdbcconnector {
    //jdbc-url
    //jdbc-username
    //jdbc-password
    private static final String url= "jdbc:postgresql://localhost/postgres";
    private static final String user = "postgres";
    private static final String password= "gn1234";
    static Connection con=null;
    public static Connection get_connection(){
        try{
            con= DriverManager.getConnection(url, user, password);
            if(con!=null){
                System.out.println("Connected to PostgreSQL server successfully!");}
            else {
                System.out.println("Failed to connect to PostgreSQL server");

            }
        }
        catch(SQLException e){
            //TODO Auto-generated catch block
            e.printStackTrace();
        }
        return con;    }
    public static void main(String[] args) {
        jdbcconnector sqlConnect=new jdbcconnector();
        sqlConnect.get_connection();

    }
}
