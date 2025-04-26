import java.util.List;
import java.util.Scanner;

public class StudentManagementApp {
    public static void main(String[] args) {
        try {
            StudentController controller = new StudentController();
            Scanner scanner = new Scanner(System.in);
            
            while (true) {
                System.out.println("\nStudent Management System");
                System.out.println("1. Add Student");
                System.out.println("2. View All Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                
                int choice = scanner.nextInt();
                scanner.nextLine(); 
                
                switch (choice) {
                    case 1:
                        addStudent(controller, scanner);
                        break;
                    case 2:
                        viewAllStudents(controller);
                        break;
                    case 3:
                        updateStudent(controller, scanner);
                        break;
                    case 4:
                        deleteStudent(controller, scanner);
                        break;
                    case 5:
                        controller.close();
                        scanner.close();
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void addStudent(StudentController controller, Scanner scanner) throws Exception {
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Department: ");
        String dept = scanner.nextLine();
        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();
        
        Student student = new Student(0, name, dept, marks);
        controller.addStudent(student);
        System.out.println("Student added successfully!");
    }
    
    private static void viewAllStudents(StudentController controller) throws Exception {
        List<Student> students = controller.getAllStudents();
        System.out.println("\nStudent List:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
    
    private static void updateStudent(StudentController controller, Scanner scanner) throws Exception {
        System.out.print("Enter Student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Enter new Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new Department: ");
        String dept = scanner.nextLine();
        System.out.print("Enter new Marks: ");
        double marks = scanner.nextDouble();
        
        Student student = new Student(id, name, dept, marks);
        controller.updateStudent(student);
        System.out.println("Student updated successfully!");
    }
    
    private static void deleteStudent(StudentController controller, Scanner scanner) throws Exception {
        System.out.print("Enter Student ID to delete: ");
        int id = scanner.nextInt();
        
        controller.deleteStudent(id);
        System.out.println("Student deleted successfully!");
    }
}
