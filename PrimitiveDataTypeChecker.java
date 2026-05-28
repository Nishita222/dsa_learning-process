import java.util.Scanner;

public class PrimitiveDataTypeChecker{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        String input = scanner.nextLine().trim();

        // Check if input is a valid integer (can be negative or positive)
        if (!input.matches("-?\\d+")) {
            System.out.println("'" + input + "' is not a valid integer.");
            scanner.close();
            return;
        }

        try {
            long number = Long.parseLong(input); // Parse as long to handle large numbers

            System.out.println(number + " can be fitted in:");

            // Check byte: -128 to 127
            if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
                System.out.println("* byte");
            }

            // Check short: -32768 to 32767
            if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
                System.out.println("* short");
            }

            // Check int: -2147483648 to 2147483647
            if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
                System.out.println("* int");
            }

            // Check long: -9223372036854775808 to 9223372036854775807
            if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) {
                System.out.println("* long");
            }

            // If none fit
            if (number < Byte.MIN_VALUE || number > Byte.MAX_VALUE &&
                number < Short.MIN_VALUE || number > Short.MAX_VALUE &&
                number < Integer.MIN_VALUE || number > Integer.MAX_VALUE &&
                number < Long.MIN_VALUE || number > Long.MAX_VALUE) {
                System.out.println("* can't be fitted anywhere.");
            }

        } catch (NumberFormatException e) {
            System.out.println("'" + input + "' can't be fitted anywhere.");
        }

        scanner.close();
    }
}

// import java.util.*;

// public class PrimitiveDataTypeChecker {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();
//         try {
//             long n = Long.parseLong(s);
//             System.out.println(n + " can be fitted in:");
//             if (n >= -128 && n <= 127) System.out.println("* byte");
//             if (n >= -32768 && n <= 32767) System.out.println("* short");
//             if (n >= -2147483648L && n <= 2147483647L) System.out.println("* int");
//             System.out.println("* long");
//         } catch (Exception e) {
//             System.out.println("'" + s + "' can't be fitted anywhere.");
//         }
//     }
// }

// // File: InstanceOfDemo.java
// class Animal { }
// class Dog extends Animal { }
// class Cat extends Animal { }

// public class PrimitiveDataTypeChecker {
//     public static void main(String[] args) {
//         Animal a1 = new Dog();
//         Animal a2 = new Cat();
//         Animal a3 = new Animal();
//         Object obj = "Hello";

//         // Using instanceof
//         System.out.println("a1 instanceof Dog:     " + (a1 instanceof Dog));     // true
//         System.out.println("a1 instanceof Animal: " + (a1 instanceof Animal));  // true
//         System.out.println("a2 instanceof Cat:     " + (a2 instanceof Cat));     // true
//         System.out.println("a3 instanceof Dog:     " + (a3 instanceof Dog));     // false
//         System.out.println("obj instanceof String: " + (obj instanceof String));  // true
//     }
// }

// import java.util.Scanner;
// public class AgeCategory {
//     public static void main(String[] args ){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your age: ");
//         int age = sc.nextInt();
//         if(age < 13){
//             System.out.println("CHIlD");
//         }else if(age >= 13 && age < 18){
//             System.out.println("TEENAGER");
//         }else if(age >= 18 && age <= 60){
//             System.out.println("ADULT");
//         }else if(age > 60){
//             System.out.println("SENIOR CITIZEN");
//         }else{
//             System.out.println("Invalid age");
//         }sc.close();
//     }
// }



