class Studentdetails {
    String name;
    int rollNo;
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}
class Marks extends Studentdetails {
    int mark1, mark2, mark3;
    public Marks(String name, int rollNo, int mark1, int mark2, int mark3) {
        super(name, rollNo);  
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
    public int getTotal() {
        return mark1 + mark2 + mark3;
    }
    public double getPercentage() {
        return (getTotal() / 3.0);
    }
    public void displayMarksDetails() {
        displayStudentInfo();
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);
        System.out.println("Total: " + getTotal());
        System.out.printf("Percentage: %.2f%%\n", getPercentage());
    }
}
public class Main {
    public static void main(String[] args) {
        Marks student = new Marks("Amit Sharma", 101, 85, 90, 78);
        student.displayMarksDetails();
    }
}



/// Child class
// class Student extends Person {
//     String grade;
//     String name; // This shadows the parent's variable

//     // Constructor using super() to initialize name and age
//     Student(String name, int age, String grade) {
//         super(name, age); // Calls Person constructor
//         this.name = "Child: " + name; // Shadowed variable
//         this.grade = grade;
//     }

//     // Overridden display method
//     @Override
//     void display() {
//         System.out.println("Child Name: " + name);
//         System.out.println("Grade: " + grade);
//         System.out.println("\n--- Parent Class Details ---");
//         super.display(); // Calls parent's display method
//     }
// }

// // Main class to test
// public class Main {
//     public static void main(String[] args) {
//         Student s1 = new Student("Nishita", 18, "A");
//         s1.display();
//     }
// }