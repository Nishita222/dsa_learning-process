class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Student extends Person {
    String name; 
    String grade;
    public Student(String parentName, int age, String studentName, String grade) {
        super(parentName, age);  
        this.name = studentName; 
        this.grade = grade;
    }
    @Override
    public void display() {
        System.out.println("Student Details");
        System.out.println("Student's Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("\nParent (Person) Details");
        super.display();
    }
}
public class SuperKeywordDemo {
    public static void main(String[] args) {
        Student student = new Student("ramesh", 45, "suresh", "S");
        student.display();
    }
}