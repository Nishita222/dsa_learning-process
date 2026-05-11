// import java.util.*;
// class test01{
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 0; i <= n; i++) {
//             for (int j = 0; j < i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// import java.util.*;
// class test01{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m =sc.nextInt();
//         int  sum = n + m;
//         System.out.println("Sum of n and m is: " + sum); // forgot to add +

//     }
// }

// import java.util.*;
// public class test01{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i = 1;i<=10;i++){
//             System.out.println( n + " X " + i + " =  " + n*i);
//         }System.out.println();
//     }
// }


// import java.util.*;
// public class test01{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
        
//         if ( age >18 ){
//             System.out.println("You are eligible to vote");
//         } else {
//             System.out.println("You are not eligible to vote");
//         }System.out.println();
//     }
// }

// import java.util.*;
// public class test01{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         if ( n == m  ){
//             System.out.println("The number is even"); //  / gives quotient and % gives remainder
//         } else {
//             System.out.println("The number is odd");
//         }System.out.println();
//     }
// }

// import java.util.*;
// public class test01{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         if ( n == m  )
//             System.out.println("The numbers are equal"); 
//         // } else if ( n > m ){
//         //        System.out.println("n greater than m");
//         // } else {
//         //         System.out.println("m greater than n");
//         // } 
//         System.out.println("The numbers are equal");
//     }
// }

// import java.util.*;
// public class test01 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//         switch( n ){
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thursday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("Invalid input");
//         }
//     }
// }

// import java.util.*;
// public class test01{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         String n = sc.nextLine();
//         switch (n){
//             case "a":System.out.println("science");
//             break;
//             case "b":System.out.println("Encylopedia");
//             break;
//             case "c":System.out.println("Mathematics");
//             break;
//             default:System.out.println("Invalid input");
//         }
//     }
// }

// import java.util.*;
// public class test01{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first number: ");
//         int a = sc.nextInt();
//         System.out.println("Enter second number: ");
//         int b = sc.nextInt();
//         System.out.println( "to add two numbers press 1 \nto subtract two numbers press 2 \nto multiply two numbers press 3 \nto divide two numbers press 4 \nto find remainder of two numbers press 5");
//         int operation = sc.nextInt();
       
//         if (operation == 1) {            
//             System.out.println("The sum of a and b is: " + (a + b));
//         } else if (operation == 2) {
//             System.out.println("The difference of a and b is: " + (a - b));
//         } else if (operation == 3) {
//             System.out.println("The product of a and b is: " + (a * b));
//         } else if (operation == 4) {
//             if (b != 0) {
//                 System.out.println("The quotient of a and b is: " + (a / b));
//             } else {
//                 System.out.println("Cannot divide by zero");
//             }
//         } else if (operation == 5){
//             if (b != 0) {
//                 System.out.println("The remainder of a and b is: " + (a % b));
//             } else {
//                 System.out.println("Cannot find remainder with zero");
//             }
//         } else {
//             System.out.println("Invalid operation");

//         }
//     }
// }

// import java.util.*;
// public class test01{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("ENTER YOUR BIRTHDAY MONTH");
//         int month = sc.nextInt();
//         switch(month){
//             case 1: System.out.println("JANUARY");
//             break;
//             case  2: System.out.println("FEBRUARY");
//             break;
//             case 3: System.out.println("MARCH");
//             break;
//             case 4: System.out.println("APRIL");
//             break;
//             case 5: System.out.println("MAY");
//             break;
//             case 6: System.out.println("JUNE");
//             break;
//             case 7: System.out.println("JULY");
//             break;
//             case 8: System.out.println("AUGUST");
//             break;
//             case 9: System.out.println("SEPTEMBER");
//             break;
//             case 10: System.out.println("OCTOBER");
//             break;
//             case 11: System.out.println("NOVEMBER");
//             break;
//             case 12: System.out.println("DECEMBER");
//             default: System.out.println("Invalid input");

//         }
//     }  
// }

// import java.util.*;
// public class test01{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i=1; i<n; i=i+1){  // variable initialization within for loop
//             System.out.println(i);
//         }
//     }
// }


// while loop condition is checked first and then the statements are executed, so if the condition is false at the beginning, the statements will not be executed at all. 
// import java.util.*;
// public class test01{
//     public static void main(String[] args){
//         int i = 1;
//         while (i < 8) {   //variable initialization and incremention outside the while loop
//             System.out.print(i+"  ");
//             i++;
//         }
//     }
// }

//phle kaam fir check condition
// in contrast do while loop executes the statements at least once before checking the condition, so even if the condition is false at the beginning, the statements will be executed at least once.
// import java.util.*;
// public class test01{
//     public static void main(String[] args){
//         int i = 9;
//         do {
//             System.out.print(i+"  ");
//             i++;
//         } while (i < 8);   //{; ye mtt bhulna }variable initialization and incremention outside the do while loop
//     }
// }

// import java.util.*;
// public class test01{
//     public static void main(String[] args){
//         int i = 6;
//         int sum =0;
//         for (int n=1; n<=i;n++){
//             sum= sum +n;
// // andar sum likhne se the sum gets updated with each iteration and it gets printed with each iteration
//         }System.out.println(sum);
//     }
// }

//PATTERN QUESTIONS
// SOLID RECTANGLE & NESTED LOOPS 
// import java.util.*;
// public class test01{
//     public static void main(String[] args){
//         int x = 5;
//         for (int i = 1; i < x; i++) {
//             for (int j = 1; j <= x; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

//hollow rectangle
// import java.util.*;
// public class test01{
//     public static void main(String[] args){
//         int x = 5;
//         int y = 6;
//         for (int i = 1; i <=x; i++) {
//             for (int j = 1; j <= y; j++) {
//                 if (i == 1|| i== x || j == 1 || j==y){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

//half pyramid
// import java.util.*;
// public class test01{
//     public static void main(String[] args){
//         int x = 5;
//         for (int i = 1; i <= x; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

//inverted half pyramid
// import java.util.*;
// public class test01{
//     public static void main(String[] args){
//         int n=5;
//         for (int i = n; i>=1;i--){
//             for (int j = 1;j<=i;j++){ //inner loop prints stars

//                 System.out.print("* ");
//              }
//             System.out.println();
//         }
//     }
// }

//Inverted & Rotated Half Pyramid
// import java.util.*;
// public class test01{
//     public static void main(String[] args){
//         int n=4;
//         for (int i= 1;i<=n;i++){ //rows
//             // inner loop for spaces
//             for (int j=1;j<=n-i;j++){
//                 System.out.print("  ");
//             }
//             // inner loop for stars
//             for (int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }   
//             System.out.println();       
//         }
//     }
// }

//half pyramid with number 
// import java.util.*;
// public class test01{
//     public static void main(String[] args){
//         int x=5;
//         for (int i = 1; i<=x;i++){
//             for (int j = 1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }    
//     }
// }


// inverted half pyramid with number
// import java.util.*;
// public class test01{
//     public static void main(String[] args){
//         int n=5;
//         for (int i = 1; i<=n;i++){
//             for (int j = 1; j<=n-i+1;j++){
//                 System.out.print(j);  // yahan j jb likha toh 12345 print hua in a row toh use you can as 1's print hue in first column as 
//             }
//             System.out.println();
//         }    
//     }
// }

// Floyd's triangle
// import java.util.*;
// public class test01{
//     public static void main(String[] args){
//         int num = 1 ;
//         int n =5;
//         for (int i=1; i<=n;i++){
//             for (int j=1; j<=i;j++){
//                 System.out.print(num+" ");
//                 num++;
//             }System.out.println();
//         }
//     }
// }

//0-1 triangle
// import java.util.*;
// public class test01{
//     public static void main(String[] args){
//         int n=5; 
//         for (int i=1; i<=n;i++){
//             for (int j=1; j<=i;j++){
//                 if ((i+j)%2==0){
//                     System.out.print("1");
//                 }else{
//                     System.out.print("0");
//                 }
//             }System.out.println();
//         }
//     }
// }

//ADVANCED PATTERNS
// RHOMBUS
// import java.util.*;
// public class test01{
//     public static void main(String[] args){
//         int n =  5;
//         for (int i=1; i<=n;i++){
//             for(int j =1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for (int j=1;j<=n;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
        
// }

//NUMBER PYRAMID // you dont need an if really if //use if for alternating conditions
// import java.util.*;
// public class test01{
//     public static void main(String[] args){
//         int n = 5;
//         for (int i=1;i<=n;i++){
//             for (int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for (int j=1;j<=i;j++){
//                 System.out.print(i+ " ");
//             }
//             System.out.println();
//         }
//     }
// }

//BUTTERFLY PATTERN
// import java.util.*;
// public class test01{
//     public static void main(String[] args){
//         int n = 4;
//         //UPPER HALF
//         for (int i=1;i<=n;i++){
//             //1ST PART
//             for (int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             //SPACES
//             for( int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//             //2ND PART
//             for (int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
            
//         }
//         //LOWER HALF
//         for (int i=n;i>=1;i--){
//             //1ST PART
//             for (int j=1;j<=i;j++){ // SIRF YAHAN I KI VALUE DEKHO KI KYA PRINT KARNA HAI
//                 System.out.print("*");
//             }
//             //SPACES
//             for( int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//             //2ND PART
//             for (int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
            
//         }
       
//     }
// }

//PALINDROME PATTERN
// import java.util.*;
// public class test01{
//     public static void main(String[] args){
//         int n = 5;
//         for (int i=1;i<=n;i++){
//             //SPACES
//             for (int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             // FIRST HALF OF NUMBERS //DECREASING PART shuru horha hai from 3(or 2 or 4) print kr rha till 1 
//             for (int j=i;j>=1;j--){
//                 System.out.print(j);
//             }
//             //SECOND HALF OF NUMEBERS //INCREASING PART shuru horha hai from 2(or 3 or 4) print kr rha till i
//             for (int j=2;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


//DIAMOND PATTERN
// import java.util.*;
// public class test01{
//     public static void main(String[] args){
//         int n=5;
//         // loop for upper half of diamond
//         for (int i = 1; i<=n;i++){
//             //spaces
//             for (int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             // stars
//             for (int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }
//             // //first half of stars
//             // for(int j=1;j<=i;j++){
//             //     System.out.print("*");
//             // }
//             // //second half of stars
//             // for (int j=1;j<=i-1;j++){
//             //     System.out.print("*");
//             // }
//             System.out.println();
//         }
//         // loop for lower half of diamond
//         for (int i = n-1; i>=1;i--){
//             //spaces
//             for (int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             // stars
//             for (int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }

//             // //first half of stars
//             // for(int j=1;j<=i;j++){
//             //     System.out.print("*");
//             // }
//             // //second half of stars
//             // for (int j=1;j<=i-1;j++){
//             //     System.out.print("*");
//             // }
//             System.out.println();
//         }
//     }
// }

//FUNCTIONS
// import java.util.*;
// public class test01{
//     // function definition
//     // public,static = keywords, void = return type, printMyName = function name(identifier), () = parameter list
//     public static void printMyName(String name){
//         System.out.println(name);
//         return;  //jahan se bhi aap iss function ke andar kaam krne aaye the bahr nikal jaiye
//     }
//     public static void main(String[] args){
//         Scanner sc =new Scanner(System.in);
//         String name = sc.nextLine();
//         printMyName(name); //function call
//     }
// }

// import java.util.*;
// public class test01 {

//     // public static int add2Numbers(int a, int b){
//     //     int sum = a+b;
//     //     return sum;
//     // }

//     public static int calcuProduct(int a,int b){
//         return a*b;  //no new variable defined
//     }
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int x = sc.nextInt();
//         int y = sc.nextInt();
//         System.out.println(calcuProduct(x, y));
//         // int sum= add2Numbers(x, y);
//         // System.out.println(sum);
//     }
// }



//FACTORIAL NUMBER 
// import java.util.*;
// public class test01{
//     public static void calculateFactorial(int n){
//         int factorial = 1;
//         if(n<0){
//             System.out.println("Invalid input!");
//             return;
//         }
//         for (int i=n;i>=1;i--){
//             factorial =factorial *i; // jo aap 1 se multiply krne ka soch rhi ki 1x2x3 that one should come from factorial
//         }
//         System.out.println(factorial);
//     }
//      public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         calculateFactorial(a);
//     }
// }



//
// import java.util.*;
// public class test01{
//     public static int calcAverage(int a, int b, int c){
//         int avg = (a+b+c)/3; 
//         return avg;
//     }
//     public static void main (String[] args){
//         Scanner sc= new Scanner(System.in);
//         int x = sc.nextInt();
//         int y = sc.nextInt();
//         int z = sc.nextInt();
//         System.out.println( "Average of three sums is:"+ calcAverage(x, y, z));
//     }
// }

// import java.util.*;
// public class test01{
//     public static int sumOfOddNumbers(int n){
//         int sum=0;
//         for(int i=1;i<=n;i++){
//             if (i%2!=0){// dont forget you need sum of odd numbers
//                 sum = sum + i;
//             }
//         }
//         return sum;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println("Sum of odd numbers from 1 to "+n+" is: "+sumOfOddNumbers(n));
//     }
// }

// import java.util.*;
// public class test01 {

//     public static void greaterAmongThe2Numbers(int a , int b){
//         if (a>b){
//             System.out.println(a+" is greater than "+b);
//         } else if (b>a){
//             System.out.println(b+" is greater than "+a);
//         } else {
//             System.out.println("Both numbers are equal");
//         }
//         return;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int y = sc.nextInt();
//         greaterAmongThe2Numbers(x, y);
//     }
// }


//infinite loop using do while
// import java.util.*;
// public class test01{
//     public static void main(String[] args){
//         int n = 5;
//         do{
//             System.out.println("*");
//         }while(n>1);
//     }
// }


//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
import java.util.*;
public class test01{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        int positive = 0; // counter for positive number
        int negative =0 ;
        int zeros =0;
        //int num = sc.nextInt();{ input only taken once}  here input only taken once and only that input is taken for iteration 
         //no new inputs are taken and any other input you try to give is considered as your yes/no input 
        while (choice ==  1){  // we use == not = as = does assignment and inside conditions java checks true or false so ==
            int num= sc.nextInt(); //{ input must also be taken repeatedly }
            if (num >0){ 
                positive++;
                
            }else if ( num<0){
                negative++;
            }else if (num ==0){
                zeros++;
            }else{
                System.out.println("INVALID INPUT");
            }
            System.out.println("Do you want to continue? Press 1 for yes and 0 for no");
            choice =  sc.nextInt();
        }
        System.out.println("Positive "+ positive);
        System.out.println("Negative "+ negative);
        System.out.println("Zeros "+ zeros);
        
    }
}
