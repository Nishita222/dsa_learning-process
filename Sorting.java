public class Sorting{
    public static void array(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {7,8,3,1,2};

        // //bubble sort
        // //outer loop counts n-1 iterations
        // for (int i= 0;i<arr.length-1;i++){
        //     //loop we want ki unsorted elements pe hi iterate kre
        //     //i=0 == zero element sorted i=1 1 element sorted
        //     for (int j=0;j<arr.length-1-i;j++){
        //         if(arr[j]>arr[j+1]){ // we take j as it defines actual index of elements and i is just our counter 
        //             //swap
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        // array(arr); 
        
        // // selection sort 
        // for (int i=0; i<arr.length-1; i++){
        //     int smallest = i;
        //     for (int j=i+1; j<arr.length;j++){
        //         if (arr[smallest]>arr[j]){  // if an element at i is less than j(it is iterating through unsorted elements) then we will update smallest index to j
        //             smallest = j;
        //         }
        //     }
        //     int temp = arr[smallest];
        //     arr[smallest] = arr[i];
        //     arr[i] = temp;
        // }
        // array(arr);

        //insertion sort 
        //first thing we run loop on all elements in unsorted part and we will compare it with all elements in sorted part and insert it at correct position
        for (int i=1; i<arr.length; i++){ // first element we consider it sorted
            int current = arr[i]; // the element we want to insert in sorted part
            int j = i-1; // last index of sorted part ----we use j to track sorted part
            while (j>=0 && current < arr[j]){ // current element ke liee jagah bnai jaegi we will run loop until we find the correct position of current element in sorted part
              arr[j+1] = arr[j]; // current chota hai to usko ek position aage shift krdo and kya kia humne is arr[j] ko shift kia to make space for current 
              j--;
            }
            //placement {upr wali condition jb disatisfy ho i.e current element is greater than jth element then we will place current element at j+1 position}
            arr[j+1] = current; // we will place current element at j+1 position because j is pointing to element which is smaller than current element 
            array(arr);

        }    
    }
}


// //BubbleSort
// public class Sorting {

//     public static void array(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = {7, 8, 3, 1, 2};

//         //bubble sort
//         //outer loop counts n-1 iterations
//         for (int i = 0; i < arr.length - 1; i++) {
//             //loop we want ki unsorted elements pe hi iterate kre
//             //i=0 == zero element sorted i=1 1 element sorted
//             for (int j = 0; j < arr.length - 1 - i; j++) {
//                 if (arr[j] > arr[j + 1]) { // we take j as it defines actual index of elements and i is just our counter
//                     //swap
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }

//         array(arr);
//     }
// }

// //SelectionSort
// public class Sorting {

//     public static void array(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = {7, 8, 3, 1, 2};

//         // selection sort
//         for (int i = 0; i < arr.length - 1; i++) {
//             int smallest = i;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[smallest] > arr[j]) {  // if an element at i is less than j(it is iterating through unsorted elements) then we will update smallest index to j
//                     smallest = j;
//                 }
//             }
//             int temp = arr[smallest];
//             arr[smallest] = arr[i];
//             arr[i] = temp;
//         }

//         array(arr);
//     }
// }

// //InsertionSort
// public class  Sorting {

//     public static void array(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = {7, 8, 3, 1, 2};

//         //insertion sort
//         //first thing we run loop on all elements in unsorted part and we will compare it with all elements in sorted part and insert it at correct position
//         for (int i = 1; i < arr.length; i++) {      // first element we consider it sorted
//             int current = arr[i];                   // the element we want to insert in sorted part
//             int j = i - 1;                          // last index of sorted part ----we use j to track sorted part

//             while (j >= 0 && current < arr[j]) {   // current element ke liee jagah bnai jaegi we will run loop until we find the correct position of current element in sorted part
//                 arr[j + 1] = arr[j];               // current chota hai to usko ek position aage shift krdo and kya kia humne is arr[j] ko shift kia to make space for current
//                 j--;
//             }

//             //placement {upr wali condition jb disatisfy ho i.e current element is greater than jth element then we will place current element at j+1 position}
//             arr[j + 1] = current;                  // we will place current element at j+1 position because j is pointing to element which is smaller than current element
//         }

//         array(arr);
//     }
// }
