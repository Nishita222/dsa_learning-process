class Student {
    String name;
    int age;

    Student() {               // Default constructor
        name = "nishita";
        age = 19;
    }

    void show() {
        System.out.println(name + " " + age);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();             // Output: Unknown 0
    }
}

// class Car {
//     String brand;
//     int year;

//     Car(String b, int y) {    // Parameterized
//         brand = b;
//         year = y;
//     }

//     void show() {
//         System.out.println(brand + " " + year);
//     }
// }

// public class ParameterizedConstructor {
//     public static void main(String[] args) {
//         Car c = new Car("Toyota", 2023);
//         c.show();             // Output: Toyota 2023
//     }
// }


// class Point {
//     int x, y;

//     Point(int a, int b) {
//         x = a;
//         y = b;
//     }

//     Point(Point p) {          // Copy constructor
//         x = p.x;
//         y = p.y;
//     }

//     void show() {
//         System.out.println(x + " " + y);
//     }
// }

// public class CopyConstructor {
//     public static void main(String[] args) {
//         Point p1 = new Point(5, 10);
//         Point p2 = new Point(p1);  // Copy
//         p2.show();                 // Output: 5 10
//     }
// }


// class Box {
//     int l, w, h;

//     Box() { l = w = h = 1; }           // Default

//     Box(int s) { l = w = h = s; }      // Cube

//     Box(int a, int b, int c) {         // Cuboid
//         l = a; w = b; h = c;
//     }

//     void show() {
//         System.out.println(l + "x" + w + "x" + h);
//     }
// }

// public class ConstructorOverloading {
//     public static void main(String[] args) {
//         new Box().show();         // 1x1x1
//         new Box(5).show();        // 5x5x5
//         new Box(2,3,4).show();    // 2x3x4
//     }
// }
