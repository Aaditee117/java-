import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class CourseFullException extends Exception {
    public CourseFullException(String message) {
        super(message);
    }
}

class PrerequisiteNotMetException extends Exception {
    public PrerequisiteNotMetException(String message) {
        super(message);
    }
}

class Course {
    private String name;
    private String prerequisite;
    private int capacity;
    private int enrolledStudents;

    public Course(String name, String prerequisite, int capacity) {
        this.name = name;
        this.prerequisite = prerequisite;
        this.capacity = capacity;
        this.enrolledStudents = 0;
    }

    public String getName() {
        return name;
    }

    public String getPrerequisite() {
        return prerequisite;
    }

    public boolean isFull() {
        return enrolledStudents >= capacity;
    }

    public void enroll() throws CourseFullException {
        if (isFull()) {
            throw new CourseFullException("Error: CourseFullException - The course " + name + " is full.");
        }
        enrolledStudents++;
        System.out.println("Enrollment successful in " + name);
    }
}

public class UniversityEnrollment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        HashMap<String, Course> courses = new HashMap<>();
        courses.put("Advanced Java", new Course("Advanced Java", "Core Java", 2));
        courses.put("Core Java", new Course("Core Java", "", 2));
        
        Set<String> completedCourses = new HashSet<>();
        
        System.out.print("Enroll in Course: ");
        String courseName = scanner.nextLine();
        
        Course course = courses.get(courseName);
        if (course == null) {
            System.out.println("Error: Course not found.");
        } 
        else {
            try {
                if (!course.getPrerequisite().isEmpty() && !completedCourses.contains(course.getPrerequisite())) {
                    throw new PrerequisiteNotMetException("Error: PrerequisiteNotMetException - Complete " + course.getPrerequisite());
                }
                
                course.enroll();
                completedCourses.add(course.getName());
                
            } 
            catch (PrerequisiteNotMetException | CourseFullException e) {
                System.out.println(e.getMessage());
            }
            finally {
                scanner.close();
            }

        }
        scanner.close();
    }
}
