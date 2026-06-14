//Q1. Print numbers from 5 to 1.
// public class Recursion1 {
//     public static void printNum(int n){
//         if (n == 0){
//             return;
//         }

//         System.out.print(n);
//         printNum(n-1);
//     }
//     public static void main(String[] agrs){
//         int n =5;
//         printNum(n);
//     }    
// }

//Q2. Print numbers from 1 to 5.
// public class Recursion1{
//     public static void printNum(int n){
//         if (n==6){
//             return;
//         }
//         System.out.println(n);
//         printNum(n+1);    
//     }
//     public static void main (String[] args){
//         int n=1;
//         printNum(n);
//     }
// }

//Q3. Print the sum of first n natural numbers.
// public class Recursion1{
//     public static void printSum(int i, int n, int sum){   // i tells which number we are on, n is the base case till which the sum is printed , sum is the variable which stores the sum of the numbers
//         if (i == n){
//             sum+=i;  // when i becomes n, we add it to the sum to include the last number in the sum
//             System.out.println(sum);  // we print the final sum
//             return;  // we return to exit the function
//         }
//         sum=sum+i;   // sum is updated by adding the current number i to it
//         printSum(i+1,n,sum);  // we'll call the function again with the next number (i+1) and the updated sum
//     }
//     public static void main(String[] args){
//         int n=5;
//         printSum(1,n,0);  // we start with i=1 (the first number), n is the limit, and sum is initialized to 0
//     }
// }

//Q4. Print factorial of a number n.
// public class Recursion1{
//     public static int calcFactorial(int n){  //sirf n we take coz factorial ki value hum return krwa rhe honge
//         if(n==0 || n==1){
//             return 1;
//         } 

//         int fact_nm1= calcFactorial(n-1); // hum n-1 ka factorial calculate krwa rhe honge, this is first step n-1 ki value humein inner function nikal kr dega 
//         int fact_n = n*fact_nm1;  // hum n ka factorial calculate krwa rhe honge, this is second step n ki value humein inner function nikal kr dega, aur usko n se multiply krke n ka factorial mil jayega
//         return fact_n;
//     }
//     public static void main(String[] args){
//         int n = 5;
//         int factorial = calcFactorial(n);
//         System.out.println(factorial);
//     }
// }

//Q5. Print fibonnaci sequence till nth term.
// public class Recursion1{
//     public static void printFib(int a , int b , int n){     //hum kuch calculate nhi kr rhe we only wanna print so void 
//         if (n==0){
//             return;
//         }
//         int c = a+b;
//         System.out.println(c);
//         printFib(b,c,n-1);  // hum b ko a ki jagah aur c ko b ki jagah rakh rhe honge, n-1 isliye kr rhe honge kyuki hum ek term print kr chuke honge
//     }
//     public static void main(String [] args){
//         int a = 0; int b=1; int n= 7;
//         System.out.println(a);
//         System.out.println(b);
//         printFib(a,b,n-2);  // hum n-2 isliye kr rhe honge kyuki hum already 2 terms print kr chuke honge
//     }
// } 

//Q6. Print x^n (x to the power n).
// public class Recursion1{
//     public static int calcPower(int x, int n){
//         if (n==0){
//             return 1;  // x ki power 0 hamesha 1 hoti h
//         }
//         if (x==0){
//             return 0;  // 0 ki power n hamesha 0 hoti h
//         }

//         int xToPowerNm1 = calcPower(x,n-1);  // hum n-1 ka power calculate krwa rhe honge, this is first step n-1 ki value humein inner function nikal kr dega
//         int xToPowerN = x * xToPowerNm1; // hum n ka power calculate krwa rhe honge, this is second step n ki value humein inner function nikal kr dega, aur usko x se multiply krke n ka power mil jayega
//         return xToPowerN;
//     }
//     public static void main(String[] args){
//         int x=2; int n=5;
//         int ans = calcPower(x,n);
//         System.out.println(ans);
//     }
// }

//Q7. Print x^n (stack height log n).
// public class Recursion1{
//     public static int calcPower(int x, int n){
//         if (n==0){
//             return 1;  // x ki power 0 hamesha 1 hoti h
//         }
//         if (x==0){
//             return 0;  // 0 ki power n hamesha 0 hoti h
//         }
//         //if n is even
//         if (n%2 == 0){
//             return calcPower(x,n/2) * calcPower(x,n/2);  
//         }else{
//             return calcPower(x,n/2) * calcPower(x,n/2) *x;
//         }
//     }
//     public static void main(String[] args){
//         int x=2; int n=5;
//         int ans = calcPower(x,n);
//         System.out.println(ans);
//     }
// }