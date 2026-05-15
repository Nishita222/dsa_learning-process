// EXAMPLE FOR ARRAY DEFINITION
// public class array{
//     public static void main(String[] args ){
//         // int[] marks = new int[3];  // first way of writing array
//         int[] marks = {97, 98, 95}; // second way of writing array
//         // marks[0] = 97;  
//         // marks[1] = 98;
//         // marks[2] = 95;
//         //System.out.println( marks[0] );
//         for (int i = 0; i < marks.length; i++){
//             System.out.println(marks[i]);
//         }
//     }
// }

// declaring an array but not initializing it

// import java.util.Scanner;

// public class array{
//     public static void main(String[] args ){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int numbers[] = new int [size];
//         for (int i = 0; i < size; i++){
//             System.out.println(numbers[i]);
//         }
//     }
// }

// declaring and initializing an array 
// import java.util.*;
// public class array{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();  // array ka size lelo
//         int numbers[] = new int [size]; // define an array of that size
//         for (int i = 0; i < size; i++){
//             numbers[i] = sc.nextInt();  // initialize value of array
//         }
//         for (int i = 0;i<size ; i++){ // print the value of array
//             System.out.println(numbers[i]);
//         }
//     }
// }

//QUESTION: TAKE AN ARRAY AS INPUT FROM USER. SEARCH FOR A GIVEN NUMBER X
//          AND PRINT THE INDEX AT WHICH THE NUMBER IS PRESENT. 
// import java.util.*;
// public class array{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the size of array: ");
//         int size = sc.nextInt();  // array ka size lelo
//         int numbers[] = new int [size]; // define an array of that size
//         System.out.println("Enter the values for array: ");
//         for (int i = 0; i < size; i++){
//             numbers[i] = sc.nextInt(); // initialize value of array
//         }
//         System.out.println("Enter the number to be searched: ");
//         int x = sc.nextInt(); // take input of number to be searched
//         for (int i = 0; i < numbers.length; i++){
//             if (numbers[i] == x){
//                 System.out.println("Number found at index: " + i);
//             }else{
//                 System.out.println("Number not found at index: " + i);
//             }
//         }
//     }
// }


// import java.util.*;
// public class array{
//     public static void main(String[] args){
//         int[] number = {1, 2, 3, 4, 5};
//         System.out.println("The length of array is: " + number.length);
//     }
// }

//QUESTION :Take an array of names as input from the user and print them on the screen.
// import java.util.*;
// public class array{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         String [] name = new String[size];

//         // input the names
//         for (int i=0;i<size;i++){
//             name[i] = sc.nextLine();
//         }

//         //output 
//         for (int i=0;i<name.length;i++){
//             System.out.println(i+1 + ". " + name[i]);
//         }
//     }
// }


//QUESTION: Take an array of integers as input from the user and find the minimum and maximum values in the array.
// import java.util.*;
// public class array {

//     // =====================================================================
//     // WAY 1: void method - prints min & max inside the method
//     // Use when you don't need to use the values elsewhere
//     // =====================================================================
//     public static void findMinAndMax_Way1(int[] arr) {
//         if (arr == null || arr.length == 0) {
//             throw new IllegalArgumentException("Array cannot be null or empty");
//         }

//         int min = arr[0];
//         int max = arr[0];

//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] < min) min = arr[i];
//             if (arr[i] > max) max = arr[i];
//         }

//         System.out.println("Minimum value in the array is: " + min);
//         System.out.println("Maximum value in the array is: " + max);
//     }

//     // =====================================================================
//     // WAY 2: returns int[] - returns both min & max as an array
//     // Use when you need both values in main() for further use
//     // =====================================================================
//     public static int[] findMinAndMax_Way2(int[] arr) {
//         if (arr == null || arr.length == 0) {
//             throw new IllegalArgumentException("Array cannot be null or empty");
//         }

//         int min = arr[0];
//         int max = arr[0];

//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] < min) min = arr[i];
//             if (arr[i] > max) max = arr[i];
//         }

//         return new int[]{min, max}; // result[0] = min, result[1] = max
//     }

//     // =====================================================================
//     // WAY 3: Uses Math.min() and Math.max() - cleaner loop logic
//     // Can be applied inside Way 1 or Way 2, just replaces the if-else block
//     // =====================================================================
//     public static void findMinAndMax_Way3(int[] arr) {
//         if (arr == null || arr.length == 0) {
//             throw new IllegalArgumentException("Array cannot be null or empty");
//         }

//         int min = arr[0];
//         int max = arr[0];

//         for (int i = 1; i < arr.length; i++) {
//             min = Math.min(min, arr[i]); // cleaner alternative to if (arr[i] < min)
//             max = Math.max(max, arr[i]); // cleaner alternative to if (arr[i] > max)
//         }

//         System.out.println("Minimum value in the array is: " + min);
//         System.out.println("Maximum value in the array is: " + max);
//     }

//     // =====================================================================
//     // MAIN METHOD
//     // =====================================================================
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter array size: ");
//         int size = sc.nextInt();
//         int[] arr = new int[size];

//         System.out.println("Enter " + size + " elements:");
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // --- WAY 1: void method, prints inside ---
//         System.out.println("\n--- WAY 1 (if-else, print inside) ---");
//         findMinAndMax_Way1(arr);

//         // --- WAY 2: returns int[], print in main ---
//         System.out.println("\n--- WAY 2 (returns int[]) ---");
//         int[] result = findMinAndMax_Way2(arr);
//         System.out.println("Minimum value in the array is: " + result[0]);
//         System.out.println("Maximum value in the array is: " + result[1]);

//         // --- WAY 3: Math.min/max, print inside ---
//         System.out.println("\n--- WAY 3 (Math.min & Math.max) ---");
//         findMinAndMax_Way3(arr);

//         // ❌ COMMON MISTAKE - do NOT do this:
//         // int min = findMinAndMax_Way1(arr);  → Way1 is void, can't assign to int
//         // int max = findMinAndMax_Way1(arr);  → calling twice won't give max either
//         // Solution: Use Way 2 to get both values back in main()
//     }
// }

//QUESTION: Take an array of numbers as input and check if it is an array sorted in ascending order
// import java.util.*;
// public class array{
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int size = sc.nextInt();
    //     int numbers[]= new int [size];
         
        //=================WAY 1=============================================
        //
        // input the numbers in array
        // for (int i=0;i<size;i++){
        //     numbers[i] = sc.nextInt();
        // }

        // // variable declaration and initialization
        // boolean isAscending= true ;

        // for (int i = 0; i< numbers.length-1; i++){ // SEE HOW THE TERMINATION CONDITION IS LENGTH-1, BECAUSE WE ARE COMPARING WITH THE NEXT ELEMENT nd if you take length it goes till 4, and what you gonna compare the last element with, it will give you out of bound exception
        //     if (numbers[i] > numbers[i+1]){ //check if current element is greater than the next element, if it is then it is not in ascending order
        //         isAscending = false;
        //         break;
        //     }
        // }

        // if (isAscending) {
        //     System.out.println("The array is sorted in ascending order.");
        // } else {
        //     System.out.println("The array is not sorted in ascending order.");
        // }
        //=============WAY 2===================================================




    // =====================================================================
    // METHOD: checks if array is sorted in ascending order
    // Returns true if sorted, false otherwise
    // =====================================================================
//     public static boolean isAscending(int[] arr) {
//         if (arr == null || arr.length == 0) {
//             throw new IllegalArgumentException("Array cannot be null or empty");
//         }

//         for (int i = 0; i < arr.length - 1; i++) {
//             if (arr[i] > arr[i + 1]) {
//                 return false; // found a pair out of order, stop immediately
//             }
//         }

//         return true; // no out-of-order pair found
//     }

//     // =====================================================================
//     // MAIN METHOD
//     // =====================================================================
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter array size: ");
//         int size = sc.nextInt();
//         int[] arr = new int[size];

//         System.out.println("Enter " + size + " elements:");
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         boolean result = isAscending(arr);

//         if (result) {
//             System.out.println("The array IS sorted in ascending order.");
//         } else {
//             System.out.println("The array is NOT sorted in ascending order.");
//         }
//     }
// }







































//Question: Sort an Array of Integers in ascending order
// import java.util.*;
// public class array{
//     public static void main(String []args){
//         int arr[] ={5,7,1,9,2,4};
//         System.out.println("Original array: " + " ");
//         for (int i=0;i<arr.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//         for (int i=0;i<arr.length;i++){
//             for (int j=i+1;j<arr.length;j++){
//                 if (arr[i]>arr[j]){
//                     // this is swapping technique to swap the values of arr[i] and arr[j]
//                     int temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }
//         System.out.println("\nSorted array: " + " ");
//         for (int i=0;i<arr.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }