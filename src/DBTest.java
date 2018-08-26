import java.sql.*;
public class DBTest {
    public static void main(String a[])
    {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "scott", "tiger");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select *from college");
            System.out.println("Course:\tStrength:\tYear");
            while (rs.next()) {
                System.out.println(rs.getString(1) + "\t" + rs.getInt(2) +
                        "\t" + rs.getString(3));
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }

}
