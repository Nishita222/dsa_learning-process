public class Student {
    private String name;
    private int rollNo;
    private double marks;
    private static int totalStudents = 0;

    public Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        totalStudents++;
    }

    public String getGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else return "F";
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Roll: " + rollNo +
                           ", Marks: " + marks + ", Grade: " + getGrade());
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100)
            this.marks = marks;
        else
            System.out.println("Error: Marks must be between 0 and 100");
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 101, 88.5);
        Student s2 = new Student("Priya", 102, 72);

        s1.displayInfo();
        s2.displayInfo();

        s2.setMarks(95);
        s2.displayInfo();

        System.out.println("Total Students: " + Student.getTotalStudents());
    }
}