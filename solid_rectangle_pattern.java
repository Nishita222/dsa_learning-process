// YOU TRIED THIS ONE 
// import java.util.*;
// public class solid_rectangle_pattern{
//     public static void main (String[] args){
//         for (int x=0;x<4;x++){
//             System.out.println("****");
//         }
//     }
    
// }

import java.util.*;
public class solid_rectangle_pattern{
    public static void main(String[] args){
        int m = 4;
        int n = 5;
        for(int i=1; i<=m; i++){
            for (int j=1; j<=n;j++){
                if(i==1 || i==m || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    
    
    }
}
