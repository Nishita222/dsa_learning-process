import java.util.*;

public class array {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size]; 
        
        // this loop was basically for the input like for the input of the array
// it takes the size of the array and then takes the input of the array
//and stores it in the array
        for (int i=0; i<=size ; i++){
            numbers[i]= sc.nextInt();
        }

        // this loop is for output like how output will be printed and itterated etc.,
        // it gives out null values 
        for (int i=0; i<size ; i++){
            System.out.println(numbers[i]);
        }
    }
} 