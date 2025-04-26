import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentController {
    private Connection conn;
    
    public StudentController() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/school_db", "root", "password");
    }

    public void addStudent(Student student) throws SQLException {
        String sql = "INSERT INTO Students (Name, Department, Marks) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, student.getName());
            pstmt.setString(2, student.getDepartment());
            pstmt.setDouble(3, student.getMarks());
            pstmt.executeUpdate();
        }
    }
    
    public List<Student> getAllStudents() throws SQLException {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM Students";
        
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                students.add(new Student(
                    rs.getInt("StudentID"),
                    rs.getString("Name"),
                    rs.getString("Department"),
                    rs.getDouble("Marks")
                ));
            }
        }
        return students;
    }
    
    public void updateStudent(Student student) throws SQLException {
        String sql = "UPDATE Students SET Name=?, Department=?, Marks=? WHERE StudentID=?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, student.getName());
            pstmt.setString(2, student.getDepartment());
            pstmt.setDouble(3, student.getMarks());
            pstmt.setInt(4, student.getStudentID());
            pstmt.executeUpdate();
        }
    }
    
    public void deleteStudent(int studentID) throws SQLException {
        String sql = "DELETE FROM Students WHERE StudentID=?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, studentID);
            pstmt.executeUpdate();
        }
    }
    
    public void close() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }
}
