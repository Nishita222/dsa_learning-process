public class MergeSort {
    public static void conquer(int[] arr,  int si, int mid, int ei){

        int[] merged = new int[ ei - si + 1];       //this is new array jismai we assemble sorted arrays, this is a new memory location
        int idx1 =si; // it is tracking first array
        int idx2 = mid+1; // it is tracking second array
        int x = 0; // it is tracking merged array

        // while jis tkk tb tkk sort krte jaaenge
        //also ye toh important hai for comparing two arrays maanlo on get complete  
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                // new array mein put idx1
                merged[x++] = arr[idx1++]; // another way of writing x++; idx1++
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        //EITHER OF THE ONE LOOPS BELOW WORKS AT A TIME NOT BOTH 
        // so we need to check if any of the two arrays is left, if yes then we will put them in merged array
        //i.e merge pura first array
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        //i.e merge pura second array
        while ( idx2<= ei){
            merged[x++] = arr [idx2++];
        }

        //LAST WORK
        //COPYING newarray into og array
        for(int i = 0,j=si; i< merged.length; i++, j++){
            arr[j] = merged[i];
            

        }
    }
    public static void divide(int[] arr, int si, int ei){

        //BASE CASE
       if (si >= ei ){ // means ya toh you have reached to single element array or you have completely erased arry somehow 
        return;
       }

       int mid = si +  (ei-si)/2;  // (si + ei/2) -- raises issue in space complexity -- if ever si and ei values are so big that they go out of integer zone on addition
       divide(arr, si, mid);
       divide(arr, mid+1, ei);
       conquer(arr, si, mid, ei);
    }
    public static void main (String[] args){
        int arr[] = { 6,3,9,5,2,8};
        int n = arr.length;

        divide(arr, 0, n-1);

        //print
        for (int i = 0; i<n; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}
