// public class Bits{
//     public static void main(String [] args){
//         int n = 5;
//         int pos =3;
//         int bitMask= 1<<pos;
//         if ((n & bitMask)==0){
//             System.out.println("bit was 0");
//         }else{
//             System.out.println("bit was 1");
//         }
//     }
// }

// public class Bits{
//     public static void main(String [] args){
//         int n = 5;
//         int pos =1;
//         int bitMask= 1<<pos;
//         int newNumber = (n | bitMask);
//         System.out.println(newNumber);
        
//     }
// }

// public class Bits{
//     public static void main(String [] args){
//         int n = 5;
//         int pos =2;
//         int bitMask= 1<<pos;
//         int newBitMask = ~(bitMask);

//         int newNumber = (n & newBitMask);
//         System.out.println(newNumber);
        
//     }
// }

// import java.util.*;
// public class Bits{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int n = 5;
//         int pos =2;
//         System.out.println("Enter the bit operation you want to perform: 1 for set and 0 for clear");
//         int oper = sc.nextInt();
//         int bitMask= 1<<pos;
        

//         if (oper == 1){
//             //set operation
//             int newNumber = (n | bitMask);
//             System.out.println(newNumber);
//         }else{
//             //clear operation
//             int newBitMask = ~(bitMask);
//             int newNumber = n & newBitMask;
//             System.out.println(newNumber);
//         }
//         sc.close();        
        
//     }
// }

// question...Write a program to find if a number is a power of 2 or not.
// import java.util.*;
// public class Bits{
//     public static void main(String []  args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if (n>0 && ((n & (n-1)) == 0)){
//             System.out.println("power of 2");
//         }else{
//             System.out.println("not a power of 2");
//         }
//         sc.close();
//     }
// }

// //Write a program to toggle a bit a position = “pos” in a number “n”.
// // REVERSE THE CURRENT BIT 
// import java.util.*;
// public class Bits{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int pos = sc.nextInt();
//         int bitMask = 1 << pos;

//         int newNumber = n ^ bitMask;
//         System.out.println("Result: " + newNumber);
//         sc.close();

//     }
// }

// //Write a program to count the number of 1’s in a binary representation of the number
// import java.util.*;
// public class Bits{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int count = 0;
//         while (n>0){
//             if ((n&1) ==1){
//                 count ++;
//             }
//             n=n>>1;
//         }
//         System.out.println(count);
//         sc.close();
//     }
// }

//Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from 
//one number system to another
// import java.util.*;
// public class Bits{
//     public static void decimalToBinary(int n){
//         String binary="";
//         while(n>0){
//             int remainder = n%2;
//             binary = remainder + binary ;
//             n= n/2 ;
//         }
//         System.out.println("binary"+ binary);
//     }

//     public static void binaryToDecimal(int binary){
//         int decimal = 0;
//         int power = 0;
//         while(binary >0){
//             int lastDigit = binary %10;
//             decimal = decimal + (lastDigit*(int)Math.pow(2,power));
//             power++;
//             binary= binary/10;
//         }System.out.println("decimal"+decimal);    
//     }
    

//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter decimal number:");
//         int n = sc.nextInt();

//         decimalToBinary(n);
//         System.out.println("Enter binary number:");
//         int b = sc.nextInt();

//         binaryToDecimal(b);

//         sc.close();
//     }    
// }
