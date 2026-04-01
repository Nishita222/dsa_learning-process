import java.util.*;
public class number_pyramid{
    public static void main( String[] args){
        int n=5;
        for (int i=1;i<=n;i++){     //yes this way the second loop for the numbers work well
           for (int j=1;j<=n-i;j++){
            System.out.print(".");
           }
           //numbers
           for (int j=1;j<=i;j++){
            System.out.print(i+ " ");// to print in a pyramid shape
           }   
           System.out.println();
        }
    }
    
}

// practice session
// public class number_pyramid {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = n; i >= 1; i--) {
//             for (int j = 1; j < i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k =n; k >=i; k--) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
