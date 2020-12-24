import java.sql.*;
import java.lang.*;
public class RenameTable {
    public static void main(String args[]) {
        try {
              Connection conn = null;
              Statement stmt = null;
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
              conn = DriverManager.getConnection(DB_URL);
              stmt = conn.createStatement();
              String CREATE_TABLE_SQL="CREATE TABLE players (UID INT, First_Name VARCHAR(45), Last_Name VARCHAR(45), Age INT);";
stmt.executeUpdate(CREATE_TABLE_SQL);
String str="alter table PLAYERS rename to SPORTS";
stmt.executeUpdate(str);

            ResultSet rs = stmt.executeQuery("SELECT * FROM sports;");
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("No. of columns : " + rsmd.getColumnCount());
            System.out.println("Column 1 Name: " + rsmd.getColumnName(1));
            System.out.println("Column 1 Type : " + rsmd.getColumnTypeName(1));
            System.out.println("Column 2 Name: " + rsmd.getColumnName(2));
            System.out.println("Column 2 Type : " + rsmd.getColumnTypeName(2));
            System.out.println("Column 3 Name: " + rsmd.getColumnName(3));
            System.out.println("Column 3 Type : " + rsmd.getColumnTypeName(3));
            System.out.println("Column 4 Name: " + rsmd.getColumnName(4));
            System.out.println("Column 5 Type : " + rsmd.getColumnTypeName(4));
            stmt.close();
            conn.close();

        }
       catch(Exception e){ System.out.println(e);}  
    }
}
