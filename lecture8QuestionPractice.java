// QUESTION 1. Enter 3 numbers from the user and make a function to print their average
// import java.util.*;
// public class lecture8QuestionPractice {
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
// public class lecture8QuestionPractice{
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
// public class lecture8QuestionPractice{
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
// public class lecture8QuestionPractice{
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
// public class lecture8QuestionPractice {

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
// public class lecture8QuestionPractice {

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
// public class lecture8QuestionPractice {
//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         int choice = 1, positive = 0, negative =0, zeros =0;
//          // counter for positive number
//         //int num = sc.nextInt();{ input only taken once}  here input only taken once and only that input is taken for iteration no new inputs are taken and any other input you try to give is considered as your yes/no input 
//         while (choice ==  1){  // we use == not = as = does assignment and inside conditions java checks true or false so ==
//             int num= sc.nextInt(); //{ input must also be taken repetedly }
//             if (num >0){ 
//                 positive++;
                
//             }else if ( num<0){
//                 negative++;
//             }else if (num ==0){
//                 zeros++;
//             }else{
//                 System.out.println("INVALID INPUT");
//             }
//             System.out.println("Do you want to continue? Press 1 for yes and 0 for no");
//             choice =  sc.nextInt();
//         }
//         System.out.println("Positive "+ positive);
//         System.out.println("Negative "+ negative);
//         System.out.println("Zeros "+zeros);
//     }
// }

//QUESTION 8. Two numbers are entered by the user, x and n. Write a function 
//            to find the value of one number raised to the power of another 
//            i.e. x^n.
// import java.util.*;
// public class lecture8QuestionPractice {
//     public static double power(double x,double n){ // YOU ALSO CHANGE THE DATA TYPE TO DOUBLE AS YOU SEE YOU MIGHT WANNA FIND OUT WHAT 0.5^2 IS
//         //int result = x^n; this is not the correct way to calculate power in java, you can use Math.pow(x,n) or you can use a loop to multiply x by itself n times
//         double result = Math.pow(x,n); // use double to store the result as it can be a decimal number AS YOU SEE 2^-1=0.5
//         return result;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Double a = sc.nextDouble();
//         Double b = sc.nextDouble();
//         System.out.println(a + " raised to the power of " + b + " is " + power(a,b));
//     }
// }

// QUESTION 9. Write a function that calculates the Greatest Common Divisor of 2 numbers
// import java.util.*;
// public class lecture8QuestionPractice {
//     public static int gcd(int a, int b){
//         // METHOD 1 .Instead of subtracting again and again,
//         // we directly take the remainder.
//         // Modulo is basically:
//         // fast repeated subtraction

//         while(b != 0){

//             int temp = b;

//             b = a % b; //b = a % b 
//             a = temp;  // a = old b
//         }

//         return a;
//     }

    
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();

//     System.out.println("GCD = " + gcd(a,b)); // this goes in// if anyhting below is used
       
    // this for loop is not the most efficient way to calculate GCD,AS IT ITERATES i NUMBER OF TIMES
    //  i.e CONSUMES TIME you can use Euclidean algorithm which is much faster and more efficient for large numbers
    // int gcd = 1;
    // for (int i=1; i<=a && i<=b; i++){
    //     if (a%i == 0 && b%i == 0){
    //         gcd = i;
    //     }
    // }
    // System.out.println("GCD " + gcd );


    // WHY DOES REPEATED SUBTRACTION WORK? 
    // BECAUSE GCD OF TWO NUMBERS ALSO DIVIDES THEIR DIFFERENCE, SO IF WE KEEP SUBTRACTING 
    // THE smaller number from the larger number we will eventually get the GCD when both numbers become equal
    //Logic We keep removing the smaller number from the bigger number.
    // Why?
    // Because removing common chunks does NOT change common factors.
    //Keep shrinking bigger number until both become same.
    // That final equal number = GCD.

    // THEREFORE WE USE WHILE LOOP
    // while( a!=b){ // if at any instant a is equal to b the control flow will come out of the loop
    //     if (a>b)
    //         a = a-b; // if a is greater than b we will subtract b from a and assign the result to a
    //     else
    //         b = b-a; // if b is greater than a we will subtract a from b and assign the result to b
    // }
    // System.out.println("GCD " + a);
//     }
// }


// Question 10. Write a program to print Fibonacci series of n terms where n is input by user :0 1 1 2 3 5 8 13 21 ..... In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
// import java.util.*;
// public class lecture8QuestionPractice {
//     public static void fibonacciSeries(int n){
//         int a =0;
//         int b= 1;
//         System.out.print(a + " " + b);
//         for(int i=3; i<=n;i++){
//             int sum = a+b;
//             System.out.print(" "+sum);
//             a=b;
//             b=sum;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.print("Fibonacci series of " + n + " terms is: "); // System.out.print("Fibonacci series of " + n + " terms is: " + fibonacciSeries(n)); problem here is public static void fibonacciSeries(int n) contains void so it does not return anything and you are trying to print the return value of the function which is void and that is why you are getting null as output, to fix this you can either change the return type of the function to String and return the Fibonacci series as a string or you can simply call the function without trying to print its return value as it already prints the Fibonacci series inside the function
//         fibonacciSeries(n);
//     }
// }











































// import java.util.*;
// public class lecture8QuestionPractice {
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
// public class lecture8QuestionPractice {
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
