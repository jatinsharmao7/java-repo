public class QuickShort2 {

    public static void quickSort(int[] arr, int left, int right,int[]arr1){

        if(left < right){
            int pivotIndex = partition(arr, left, right,arr1);
            // left part sort
            quickSort(arr, left, pivotIndex-1,arr1);

            // right part sort
            quickSort(arr,  pivotIndex+1, right,arr1);

        }
    }

    public static int partition(int[] arr, int left, int right,int[]arr1){
        int pivot = arr[right];
        int i = left-1;
        if(pivot<arr1[0]){
            arr1[0]=pivot;
        }

        System.out.println("pivot"+pivot);

        
        for(int j=left; j<right; j++){
            if(arr[j] <=pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;

        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 1, 6, 8, 5, 3, 4};
        int []arr1={arr[0]};
        System.out.println("Original Array");
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();

        quickSort(arr, 0, arr.length-1,arr1);

        System.err.println("Sorted Array");
        for(int num: arr){
            System.out.print(num + " ");
        }

        System.out.println("\nSmallest element is :"+arr1[0]);
    }

}