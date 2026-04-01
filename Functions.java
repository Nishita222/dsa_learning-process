// import java.util.*;
// public class Functions {   // class named functions
//     public static void printMyName(String name){ // accepts strings
//         System.out.println(name);// prints that name * once this method is finished control goes back to main
//         return ;
//     }
//     public static void main(String[] args) { // this is entry point of your java program when you run your program this is executed first
//         Scanner sc = new Scanner(System.in); // this creates scanner object named sc to take inputs
//         String name = sc.next(); //This reads one word (until space) from the user and stores it in a String variable called name.

//         printMyName(name);
//     }
// }

//QUESTION 1: MAKE A FUNCTION TO ADD 2 NUMBERS AND RETURN THE SUM.
// import java.util.*;
// public class Functions{
//     public static int calculateSUM(int a, int b){
//         int sum = a + b ; // this sum variable is for calculatesum 
//         return sum;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int sum = calculateSUM(a, b);
//         System.out.println(sum);
//     }
// }

//QUESTION 2: MAKE A FUNCTION TO multiply 2 NUMBERS AND RETURN THE product.
// import java.util.*;
// public class Functions{
//     public static int calculatePRODUCT(int a, int b){
//          return a * b ; //here we did not define another variable like we did in the sum question
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         System.out.println("PRODUCT OF 2 NUMBERS IS" + calculatePRODUCT(a, b)); // PRINTS A -
//     }
// }

//QUESTION 3: FIND THE FACTORIAL OF A NUMBER.[WE'LL BE USING LOOPS ]
// import java.util.*;
// public class Functions {
//     public static void printFACTORIAL(int n) { // if you write int and then later on return nothing java throws a compile time error 
//         int factorial = 1;
//         for (int i = n; i >= 1; i--) {
//             factorial = factorial * i;
//         }
//         System.out.println(factorial);
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         printFACTORIAL(n);  
//     }
// }

// import java.util.*;
// public class Functions{
//     public static int multiply2Nmbers(int a , int b ){ // you made mistake in return type here; you wrote void while you were trying to return multiply (integer)
//         int multiply= a*b;
//         return multiply;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int y = sc.nextInt();

//         System.out.println(multiply2Nmbers(x, y));
//     }
// }
