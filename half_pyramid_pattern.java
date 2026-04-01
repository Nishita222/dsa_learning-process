public class half_pyramid_pattern{
    public static void main(String [] args){
        int n = 5;
        //outer loop
        for (int i = 1; i<=n;i++){ //our i gonna define the row num as well as the upper limit i.e how many stars are we gonna print
            //inner loop
            for (int j=1; j<=i;j++){
                System.out.print("*");
            }System.out.println();
        }
    }
}

// public class half_pyramid_pattern {

//     public static void main(String[] args){
//         int m=4;
//         int n=5;
//         for (int i=1;i<=m;i++){
//             for (int j=1;j<=n;j++){
//                 if(i==1 || i==m || j==1|| j==n){
//                     System.out.print("*\n");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }System.out.println();
//         }
//     }
// }