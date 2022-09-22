package ss13_search_algorithm.exercise;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {21,43,12,6,14,17,15,9,11,45,37,28};
        Arrays.sort(arr);
        System.out.println(binarySearch(arr,0,arr.length-1,37));
    }

    static int binarySearch(int[] array, int left, int right, int value){
        if (right >= left){
            int mid = (right + left)/2;
            if (array[mid] == value){
                return mid;
            }else if (value < array[mid]){
                return binarySearch(array,left,mid - 1, value);
            }else {
                return binarySearch(array,mid + 1,right, value);
            }
        }
        return -1;
    }
}
