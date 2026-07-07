public class QuickSort{
    public static int partition(int [] arr ,int low ,int high){
        int pivot = arr[high];
        //ye dekhega ki pivot se phle kitne space is needed ---iska kaam is to track pivot se kitne chote elements aaenge hmaare array ke andar
        int i = low -1;    //i.e there's no element smaller than pivot
        
        for (int j =low ; j<high; j++ ){ //as arr[high] is already stored in pivot so 
            // the below whole if helps us place all small elements at their correct position
            if(arr[j] < pivot){
                i++;     //we found one more empty place to store smaller element than pivot
                //swap-----uss khali jagah pr stored jo phle wala element hoga use and the smaller element that we found rn after i++ made space(it made space by becoming 0 from -1)
                //kahli jagah jo honi chahiye thi vahan already array mai kuch stored hoga usko toh hum j wali jagah daal denge aur j pr jo hmaare pivotse chota hai use khali jagah pr
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp ;
            }
        }
        // we also need a empty space so as to store pivot
        i++;
        int temp = arr [i];
        arr[i] = pivot ;
        arr[high]  = temp;
        return i;  // i is pivot ka index --- i.e partition krne ke baad pivot ka sahi index

    }
    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            // we'll consider another function --- nth element ko nikalega and fir sbko sahi jagah place krke dega basically the function that does main work
            int pidx = partition(arr, low, high);

            quickSort(arr, low, pidx-1); //pidx is the index for pivot 
            quickSort(arr,pidx+1 , high);
        }

    }
    public static void main(String[] args){
        int [] arr ={6,3,9,5,2,8};
        int n = arr.length;
        
        quickSort(arr,0,n-1); 

        // print sorted array
        for (int i =0 ; i< n; i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
}