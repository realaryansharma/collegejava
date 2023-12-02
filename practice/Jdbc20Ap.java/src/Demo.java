import java.sql.*;

public class Demo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        final String JDBC_Driver = "com.mysql.cj.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://localhost:8889/asdf";

        //Database credentials
        final String USER = "root";
        final String PASS = "";

        //Register JDBC driver
        Class.forName(JDBC_Driver);

        //Open a database connect

        Connection con = DriverManager.getConnection(DB_URL, USER, PASS);

        //prepare Statement
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("Select *FROM beispiel");

        rs.close();
        stm.close();
        con.close();

    }
}
