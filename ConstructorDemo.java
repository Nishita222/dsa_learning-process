public class ConstructorDemo {
    String name; int age;

    ConstructorDemo() {
        name = "Unknown"; age = 0;
        System.out.println("Default Constructor Called");
    }

    ConstructorDemo(String name, int age) {
        this.name = name; this.age = age;
        System.out.println("Parameterized Constructor Called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        ConstructorDemo d1 = new ConstructorDemo();
        d1.display();
        ConstructorDemo d2 = new ConstructorDemo("Nishita", 19);
        d2.display();
    }
}

// // Student class
// class Student {
//     String name;
//     int rollNo;

//     // Constructor
//     public Student(String name, int rollNo) {
//         this.name = name;
//         this.rollNo = rollNo;
//     }

//     // Method to display basic student info
//     public void displayStudentInfo() {
//         System.out.println("Name: " + name);
//         System.out.println("Roll No: " + rollNo);
//     }
// }

// // Marks class inheriting from Student
// class Marks extends Student {
//     int mark1, mark2, mark3;

//     // Constructor
//     public Marks(String name, int rollNo, int mark1, int mark2, int mark3) {
//         super(name, rollNo);  // Call parent class constructor
//         this.mark1 = mark1;
//         this.mark2 = mark2;
//         this.mark3 = mark3;
//     }

//     // Method to calculate total
//     public int getTotal() {
//         return mark1 + mark2 + mark3;
//     }

//     // Method to calculate percentage (assuming each subject is out of 100)
//     public double getPercentage() {
//         return (getTotal() / 3.0);
//     }

//     // Method to display all details
//     public void displayMarksDetails() {
//         displayStudentInfo();
//         System.out.println("Mark 1: " + mark1);
//         System.out.println("Mark 2: " + mark2);
//         System.out.println("Mark 3: " + mark3);
//         System.out.println("Total: " + getTotal());
//         System.out.printf("Percentage: %.2f%%\n", getPercentage());
//     }
// }

// // Main class to test the implementation
// public class Main {
//     public static void main(String[] args) {
//         // Create a Marks object
//         Marks student = new Marks("Amit Sharma", 101, 85, 90, 78);

//         // Display details
//         student.displayMarksDetails();
//     }
// }