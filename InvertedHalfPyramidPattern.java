public class InvertedHalfPyramidPattern {
    public static void main(String[] args){
        int n=5;
        for (int i=n;i>=1;i--){ //i-->>i=i-1
            for(int j=1;j<=i; j++){
                System.out.print("* ");
            }System.out.println();
        }
    }
    
}
