public class Student {
    private String name;
    private int marks1;
    private int marks2;
    private int marks3;

    public Student(String name, int marks1, int marks2, int marks3) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public int getTotal() {
        return marks1 + marks2 + marks3;
    }

    public double getAverage() {
        return getTotal() / 3.0;
    }

    public String getGrade() {
        double avg = getAverage();

        if(avg >= 90) {
            return "A";
        }
        else if(avg >= 75) {
            return "B";
        }
        else if(avg >= 60) {
            return "C";
        }
        else if(avg >= 40) {
            return "D";
        }
        else {
            return "Fail";
        }
    }

    public void displayDetails() {
        System.out.println("\nStudent Name: " + name);
        System.out.println("Total Marks: " + getTotal());
        System.out.println("Average: " + getAverage());
        System.out.println("Grade: " + getGrade());
    }
}