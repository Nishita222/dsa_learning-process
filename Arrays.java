import java.util.*;

public class Arrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int marks [] ={97,98, 95};         // type 2 array formation 
        // int [] marks = new int[3];         // type 1 array formation 
        // marks [0] = 97 ;
        // marks [1] = 98 ;
        // marks [2] = 95 ;
        int size = sc.nextInt();
        int numbers[]= new int [size ];
        for (int i=0; i<size ; i++){
            System.out.println(numbers [i]);
        }
    }
}
 