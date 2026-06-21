//tower of hanoi problem
// public class Recursion2{
//     public static void towerOfHanoi(int n, String src, String helper, String dest) {
//         if (n == 1){
//             System.out.println("transfer disk 1 from " + src + " to " + dest);
//             return;
//         }
//         towerOfHanoi(n-1, src, dest, helper); // move n-1 disks from source to helper
//         System.out.println("Move disk " + n + " from " + src + " to " + dest); // move the nth disk from source to destination
//         towerOfHanoi(n-1, helper, src, dest); // move n-1 disks from helper to destination 
//     }


//     public static void main(String[] args){
//         int n=3;
//         towerOfHanoi (n, "S", "H", "D");
//     }
// }

//print a string in reverse.
// public class Recursion2{

//     public static void printRev(String str, int idx) {
//         if (idx == 0){
//             System.out.print(str.charAt(idx));
//             return;
//         }
//         System.out.print(str.charAt(idx));
//         printRev(str, idx-1);
//     }
//     public static void main(String[] args){
//         String str = "abcd";
//         printRev(str, str.length() - 1  );
//     }
// }

//Q.Find the first and last occurrence of a character in a string using recursion.
// public class Recursion2{

//     public static void findOccurence(String str, int idx, char element){
//         if (idx == str.length()){
//             System.out.println("First Occurrence: " + first);
//             System.out.println("Last Occurrence: " + last);
//             return;
//         }
//         char currentChar = str.charAt(idx);
//         if (currentChar == element){
//             if(first == -1){
//                 first = idx;
//             }else{
//                 last = idx;
//             }
//         }
//         findOccurence(str, idx+1, element);
//     }
//     public static int first = -1;
//     public static int last = -1;
//     public static void main(String[] args){
//         String str = "abaacdaefaah";
//         findOccurence(str, 0, 'a');
//     }
// }

//Q. Check if an array is sorted or not using recursion.
// public class Recursion2{
//     public static boolean checkSorted(int[] arr, int index){
//         if (index == arr.length-1){
//             return true;
//         }
//         if (arr[index] < arr[index+1]){
//             return checkSorted(arr, index+1); //this is inside return because we want to return the result of the recursive call, which will eventually return true if the entire array is sorted, or false if any pair of elements is found to be out of order.
//         }else{
//             return false;
//         }
        
//     }
//     public static void main (String[] args){
//         int[] arr = {1,2,3,4,5};
//         System.out.println(checkSorted(arr, 0));
//     }
// }


//Q. Move all x to the end of the string using recursion.
// public class Recursion2{
//     public static void moveAllX(String str, int idx , int count, String newStr){

//         if(idx == str.length()){
//             for(int i =0 ;i<count; i++){
//                 newStr +='x';
//             }
//             System.out.println(newStr);
//             return ;
//         }
//         char currentChar = str.charAt(idx);
//         if ( currentChar == 'x'){
//             count++;
//             moveAllX(str, idx+1, count , newStr);
//         }else{
//             newStr += currentChar;
//             moveAllX(str, idx+1,count,newStr);
//         }
//     }
//     public static void main(String[] args){
//         String str = "axbcxxd";
//         moveAllX(str , 0 , 0, " ");
//     }
// }

//Q. Remove duplicates from a string using recursion.
// public class Recursion2{
//     public static boolean[] map = new boolean[26];
//     public static void removeDuplicates(String str, int idx, String newString){
//         if (idx == str.length()){
//             System.out.println(newString);
//             return;            
//         }

//         char currChar = str.charAt(idx);
//         if (map [currChar - 'a'] == true){
//             removeDuplicates(str, idx+1, newString);
//         }else{
//             newString += currChar;
//             map[currChar - 'a'] = true;
//             removeDuplicates(str, idx+1, newString);
//         }
//     }
//     public static void main(String[] args){
//         String str = "abbccda";
//         removeDuplicates(str, 0,"");
//     }
// }

//Q. Print all subsequences of a string using recursion.
// public class Recursion2{
//     public static void subsequences(String str, int idx, String newString){
//         if (idx ==str.length()){
//             System.out.println(newString);
//             return;
//         }
//         char currentChar = str.charAt(idx);
//         // to be
//         subsequences(str, idx+1, newString + currentChar);

//         // or not to be
//         subsequences(str, idx+1, newString);
//     }
//     public static void main(String[] args){
//         String str = "abc";
//         subsequences(str, 0, "");
//     }
// }

//Q. Print all the unique subsequences of a string
// import java.util.HashSet;
// public class Recursion2{
//     public static void subsequences(String str, int idx, String newString, HashSet<String> set){
//         if (idx ==str.length()){
//             if (set.contains(newString)){
//                 return;
//             }else{
//                 System.out.println(newString);
//                 set.add(newString);
//                 return;
//             }
//         }
//         char currentChar = str.charAt(idx);
//         // to be
//         subsequences(str, idx+1, newString + currentChar, set);

//         // or not to be
//         subsequences(str, idx+1, newString,set);
//     }
//     public static void main(String[] args){
//         String str = "aaa";
//         HashSet<String> set = new HashSet<>();
//         subsequences(str, 0, "",set);
//     }
// }

//Q. Print keypad combination.
// public class Recursion2{
//     public static String [] keypad = {".","abc","def", "ghi","jkl", "mno","pqrs", "tu", "vwx","yz"}; // keypad mapping

//     public static void printComb(String str, int idx, String combination){
//         if(idx == str.length()){
//             System.out.println (combination);
//             return;
//         }
//         char currChar = str.charAt(idx); // 2
//         String mapping = keypad[currChar - '0']; //def
//         for(int i =0; i< mapping.length(); i++){ // loop on def
//             printComb(str, idx+1 ,combination + mapping.charAt(i)); // mapping.charAt(i)--> d ko add kia --> e ko add kia --> f ko add kia  1st level
//         }
//     }
//     public static void main (String [] args){
//         String str = "546";
//         printComb(str,0,"");
//     }
// }