//print all the permutations of a string using recursion
// public class Recursion3{
//     public static void printPerm (String str , String permutation){
//         if (str.length() == 0){
//             System.out.println(permutation);
//             return;
//         }

//         for(int i=0; i<str.length(); i++){
//             char currChar = str.charAt(i);
//             String newStr = str.substring (0,i) + str.substring(i+1);
//             printPerm(newStr, permutation + currChar);
//         }
//     }
//     public static void main(String[] args){
//         String str = "abc" ;
//         printPerm(str, "");
//     }
// }

//count total paths in a maze from top left(0,0) to bottom right(n,m)
// public class Recursion3{
//     public static int countPaths(int i , int j , int n , int m){
//         if (i == n || j==m){
//             return 0;
//         }
//         if(i== n-1 && j ==m-1){
//             return 1;
//         }

//         // move downwards 
//         int downPaths = countPaths (i+1,j,n,m);

//         //move right
//         int rightPaths = countPaths(i,j+1,n,m);
//         return downPaths + rightPaths ;
//     }
//     public static void main(String[] args){
//         int n=3 ; int m = 3;
//         int totalPaths = countPaths(0,0,n,m);
//         System.out.println(totalPaths);
//     }
// }

// place tiles of size 1xm in a floor of size nxm
// public class Recursion3{
//     public static int placeTiles(int n , int m){

//         if (n < m ){
//             return 1;
//         }
//         if (n == m){
//             return 2;
//         }

//         // vertically 
//         int verPlacements = placeTiles(n-m, m); // i.e upar ka m size of the floor tile has been filled 

//         // horizontally 
//         int horPlacements = placeTiles(n-1, m); // i.e upr ka 1 size of the floor tile has been filled 
//         return verPlacements + horPlacements ;
//     }
//     public static void main(String[] args){
//         int n= 4; int m=2;
//         int totalPlacements = placeTiles(n,m);
//         System.out.println(totalPlacements);
//     }
// }

// find the number of ways in which you can invite n people to a party, single or in pairs
// public class Recursion3{
//     public static int callGuests(int n){
//         if (n<=1){
//             return 1;
//         }
//         //single
//         int way1 = callGuests(n-1);

//         //pair
//         int way2 = (n-1) *callGuests(n-2);

//         return way1 + way2 ;  
//     }
//     public static void main(String[] args){
//         int n = 4;
//         System.out.println(callGuests(n));
//     }
// }

//print all subsets of first n natural numbers
// import java.util.*;
// public class Recursion3{
//     public static void printSubset(ArrayList<Integer> subset){
//         for(int i=0;i<subset.size();i++){
//             System.out.println(subset.get(i)+"");
//         }
//         System.out.println();
//     }
//     public static void findSubsets(int n , ArrayList<Integer> subset){
//         if (n==0){
//             System.out.println(subset);
//             return;
//         }
//         //hrr level pr element has choice if it wants be added or not
//         //add hoga
//         subset.add(n);
//         findSubsets(n, subset);
//         //add nhi hoga
//         subset.remove(subset.size()-1);
//         findSubsets(n-1, subset);
//     }
//     public static void main (String[] args){
//         int n = 3;
//         ArrayList<Integer> subset = new ArrayList<>();
//         findSubsets(n-1, subset);
//     }
// }

import java.util.ArrayList;

public class Recursion3 {

    public static void findSubsets(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            System.out.println(subset);
            return;
        }

        // include n
        subset.add(n);
        findSubsets(n - 1, subset);

        // exclude n
        subset.remove(subset.size()-1);
        findSubsets(n - 1, subset);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
    }
}