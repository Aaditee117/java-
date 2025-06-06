public class Student {
    private int studentID;
    private String name;
    private String department;
    private double marks;
    
    // Constructor
    public Student(int studentID, String name, String department, double marks) {
        this.studentID = studentID;
        this.name = name;
        this.department = department;
        this.marks = marks;
    }
    
    // Getters and Setters
    public int getStudentID() { return studentID; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getMarks() { return marks; }
    
    public void setStudentID(int studentID) { this.studentID = studentID; }
    public void setName(String name) { this.name = name; }
    public void setDepartment(String department) { this.department = department; }
    public void setMarks(double marks) { this.marks = marks; }
    
    @Override
    public String toString() {
        return "Student [ID=" + studentID + ", Name=" + name + 
               ", Department=" + department + ", Marks=" + marks + "]";
    }
}
