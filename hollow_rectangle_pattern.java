import java.util.*;
public class hollow_rectangle_pattern {
    public static void main(String[] args){
        int n= 4; //variable initialization 4 rows and 5 columns
        int m = 5;
        for (int i=1; i<=n; i++){  //i represents the current row number-->Start from row 1 and go up to row 4 (since i <= n).-->You are visiting each row one by one — no skipping
            for (int j=1;j<=m;j++){ //j represents the current column number in a given row.-->Start from column 1 and go up to column 5.-->So, inside every row, you move left to right across all columns.
                //cell -> (i,j)
                if(i==1 || j==1 || i ==n || j == m){
                    System.out.print("f");
                }else{
                    System.out.print(" ");
                }  
            }
            System.out.println();
        }
    }   
}
