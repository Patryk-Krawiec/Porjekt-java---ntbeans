package projekt;
import java.sql.*;

/*
Przykład na połączenie z Oracle i wysyłanie do serwera zwykłych zapytań sql
*/
public class OracleConnection {

    public static Connection getConnection() { 
        Connection con = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SID","username","password");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:kosmos","student","student1");

            Statement statement = con.createStatement();

        } catch(Exception ex) { 
            System.out.println(ex.getMessage());
        }
        return con;
    }   
}