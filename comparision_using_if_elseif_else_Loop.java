import java.util.*;

public class comparision_using_if_elseif_else_Loop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();

        if(a==b)
            System.out.println("x is equal to y");           
        else if(a>b){
            System.out.println("a is greater than b");  
        }else {
            System.out.println("a is less than b");
        }
    }    
}