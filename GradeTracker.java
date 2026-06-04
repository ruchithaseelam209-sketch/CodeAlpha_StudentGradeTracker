import java.util.ArrayList;

public class GradeTracker {

    private ArrayList<Student> students = new ArrayList<>();

    // Add student to list
    public void addStudent(Student student) {
        students.add(student);
    }

    // Display all students
    public void displayAllStudents() {

        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("\n===== Student Results =====");

        for (Student s : students) {
            s.displayDetails();
        }
    }
}