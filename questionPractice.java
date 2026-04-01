// QUESTION 1. Enter 3 numbers from the user and make a function to print their average
// import java.util.*;
// public class questionPractice {
//     public static int calculateAverage(int a, int b, int c){
//         int sum = a + b + c;
//         int avg = sum/3 ;
//         return (avg);
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         System.out.println("The average of the three sum is " + calculateAverage(a,b,c));
//     }    
// }


//QUESTION 2. Write a function to print the sum of all odd numbers from 1 to n.
// import java.util.*;
// public class questionPractice{
//     public static int printOddNumbers(int n){
//         int x = 1; // to store total ---  you need a variable to keep adding into
//         for (int i=1;i<=n;i++){ //Loop from 1 to n — checking every number one by one.
//             if (i % 2 !=0){    // Check if the current number i is odd
//                 x+=i; // Add the current odd number to the running total sum
//             }
//         }
//         return x;
//     }
//     public static void main( String[] args){
//         Scanner sc = new Scanner( System.in );
//         int n = sc.nextInt();
//         System.out.println("Sum of odd numbers from 1 to " + n + " is " + printOddNumbers(n));
//     }
// } 

//QUESTION 3. Write a function that takes in 2 numbers and returns the greater of those two.
// import java.util.*;
// public class questionPractice{
//     public static int greaterNUMBER(int a, int b){
//         if(a>b){
//             return a;
//         }else{
//             return b;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("THE FIRST NUMBER");
//         int a = sc.nextInt();
//         System.out.println("THE SECOND NUMBER");
//         int b = sc.nextInt();

//         System.out.println("THE GREATER NUMBER IS " + greaterNUMBER(a, b));

//     }
// }

// QUESTION 4. Write a function that takes in the radius as input and returns the circumference of a circle
// import java.util.*;
// public class questionPractice{
//     public static double circumference(int r){
//         double x = 2*3.14*r; // 3.14 is double by default
//         return x;
//     }
//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();
//         System.out.println("Circumference of the circle with radius " + r + " is " + circumference(r));
//     }
// }

// QUESTION 5. Write a function that takes in age as input and returns if that person is eligible to vote or not.
// import java.util.*;
// public class questionPractice {

//     public static String eligibleToVoteOrNot(int x){
//         if (x>18){
//             return "Eligible To Vote";
//         }else{
//             return "Not Eligible To Vote";
//         }
//     }
//     public static void main(String[] args) {
//         Scanner y = new Scanner(System.in);
//         int x = y.nextInt();
//         System.out.println("" + eligibleToVoteOrNot(x));
//     }
// }

//QUESTION 6. Write an infinite loop using do while loop.
// import java.util.*;
// public class questionPractice {

//     public static void main(String[] args){
//         int i = 0;
//         do{
//             System.out.println(i);
//         }while (i<1);
//     }
// }

// QUESTION 7. Write a program to enter the numbers till the user wants and 
//             at the end it should display the count of positive, negative and
//             zeros entered.
// import java.util.*;

// public class questionPractice {
//     public static boolean printPrimeNumber(int n) {
//         if (n <= 1) return false;

//         for (int i = 2; i <= Math.sqrt(n); i++) {
//             if (n % i == 0) {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();

//         if (printPrimeNumber(x)) {
//             System.out.println(x + " is a prime number.");
//         } else {
//             System.out.println(x + " is not a prime number.");
//         }
//     }
// }


// import java.util.*;
// public class questionPractice {
//     public static String isNumberEven(int n) {
//         if (n % 2 == 0) {
//             return "The number is even.";
//         } else {
//             return "The number is not even.";
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();

//         // Print the returned message
//         System.out.println(isNumberEven(x));
//     }
// }
