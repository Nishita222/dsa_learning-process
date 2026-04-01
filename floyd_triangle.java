import java.util.*;
public class floyd_triangle {
    public static void main(String[] args) {
        int n=5;
        int num =1;

        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){ // inner loop basically tells us how many numbers are to be pritned in each row
                System.out.print(num+" ");
                num++;
            }System.out.println();
        }
    }
}
