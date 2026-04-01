//LOGIC 1
public class the_pyramid {
    public static void main(String[] args){
        int n=5;
        for (int i=1;i<=n;i++){ //Runs from 1 to 8 → controls the number of rows.i is your current row number.
            for(int x= n-i;x>=1;x--){ // HERE spaces's value STARTS WITH THE VALUE EQUAL TO (n-i) and goes till 1
                System.out.print(" ");
            } 
            for(int j=1;j<=i;j++){
                System.out.print("*"); //and a *+space make a perfect pyramid you can also use j<=2*i-1
            }System.out.println();
        }
    }
}
//LOGIC 2
// public class the_pyramid {
//     public static void main(String[] args){
//         int n=5;
//         for (int i=1;i<=n;i++){ //Runs from 1 to 8 → controls the number of rows.i is your current row number.
//             for(int j=1;j<=n-i;j++){ 
//                 System.out.print(" ");
//             } 
//             for(int j=1;j<=i;j++){
//                 System.out.print("*"); //and a *+space make a perfect pyramid you can also use j<=2*i-1
//             }System.out.println();
//         }
//     }
// }