import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1,9,6,56,87,67};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int lo , int hi) {
        if (lo >= hi) {
            return;
        }
        int i = lo, j= hi;
        int pivot = arr[lo+(hi-lo)/2];
        while(i<j){
            while(arr[i]<pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<=j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp; 
                i++;
                j--;
            }
        }
        quickSort(arr, lo, j);
        quickSort(arr, i, hi);
    }
}
