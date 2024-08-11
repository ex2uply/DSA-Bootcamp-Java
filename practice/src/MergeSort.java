import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1,2,6,7,3,5,4,5,9};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int [] mergeSort(int[] arr){
        if(arr.length <= 1){
            return arr;
        }

        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int [] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left,right);
    }
    public static int[] merge(int[] left, int[] right){
        int[] newArr = new int[left.length + right.length];
        int i = 0, j = 0,k=0;
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                newArr[k] = left[i++];
            }else{
                newArr[k] = right[j++];
            }
            k++;
        }
        while(i < left.length){
            newArr[k++] = left[i++];
        }
        while(j < right.length){
            newArr[k++] = right[j++];
        }
        return newArr;
    }


}