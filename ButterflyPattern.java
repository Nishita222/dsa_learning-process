// import java.util.*;
// public class ButterflyPattern{
//     public static void main( String [] args){
//        int n=4;
//        for(int i=1; i<=4; i++){
//         for (int j=1; j<=i; j++){
//             System.out.print("*");
//         }
//         for (int j=1; j<=(n-i)*2;j++){
//             System.out.print(" ");
//         }
//         for (int j=1;j<=i;j++){
//             System.out.print("*");
//         }System.out.println();
//        } 
//        for(int i=n;i>=1;i--){
//         for (int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         for (int j=1; j<=(n-i)*2;j++){
//             System.out.print(" ");
//         }
//         for (int j=1;j<=i;j++){
//             System.out.print("*");
//         }System.out.println();
//        } 
//     }
// }

//HOLLOW BUTTERFLY 
// public class HollowXPatternFixed {
//     public static void main(String[] args) {
//         int n = 9; // Size of the square pattern (odd preferred for symmetry)

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 // Check for main diagonal or counter diagonal
//                 if (j == i || j == (n - i + 1)) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
 import java.util.*;
 public class ButterflyPattern {
    public static void main(String[] args){
        int n=5;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=1;j++){
                System.out.print("*");
            }for(int j=3;j<=i;j++){
                System.out.print("/");
            }for(int j=3;j<=3;j++){
                System.out.print("*");
            }System.out.println();
        }
    }
 }

