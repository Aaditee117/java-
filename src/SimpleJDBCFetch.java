import java.sql.*;

public class SimpleJDBCFetch {
    public static void main(String[] args) {
        final String DB_URL = "jdbc:mysql://localhost:3306/company_db";
        final String USER = "root";
        final String PASS = "password";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            Statement stmt = conn.createStatement();
            String sql = "SELECT EmpID, Name, Salary FROM Employee";
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Employee Records:");
            System.out.println("ID\tName\tSalary");
            System.out.println("---------------------");
            while (rs.next()) {
                int id = rs.getInt("EmpID");
                String name = rs.getString("Name");
                double salary = rs.getDouble("Salary");
                System.out.println(id + "\t" + name + "\t" + salary);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection error!");
            e.printStackTrace();
        }
    }
}
