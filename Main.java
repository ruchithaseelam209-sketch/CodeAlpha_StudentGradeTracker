import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GradeTracker tracker = new GradeTracker();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks 1: ");
            int m1 = sc.nextInt();

            System.out.print("Enter marks 2: ");
            int m2 = sc.nextInt();

            System.out.print("Enter marks 3: ");
            int m3 = sc.nextInt();
            sc.nextLine();

            Student s = new Student(name, m1, m2, m3);
            tracker.addStudent(s);
        }

        tracker.displayAllStudents();
        sc.close();
    }
}