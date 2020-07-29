package algorithms;

import utils.IntegerArrayGenerator;
import utils.SortingHelper;

/**
 * 选择排序（基于比较的选择排序）
 */
public class SelectionSort {
    private SelectionSort(){}
    public static <T extends Comparable<T>> T[] sort(T[] arr){

        for (int i = 0;i < arr.length;i++){
            int minIndex = i;
            for (int j = i;j<arr.length;j++){
                if(arr[j].compareTo(arr[minIndex]) < 0){
                    //arr[j] < arr[minIndex],最小的放在最前面，最后就是从小到大排序
                    minIndex = j;
                }
            }
            swap(arr,i,minIndex);
        }

        return arr;
    }

    private static <T> void swap(T[] arr,int i,int minIndex){
        T arr_i = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = arr_i;
        return;
    }

    public static void main(String[] args) {
//        Integer[] arr = {95,3,0,7,88,5,66,88,2,95,3,0,7,88,5,66,88,2};
        int[] dataSize = {10000,100000};
        for (int size : dataSize){
            Integer[] arr = IntegerArrayGenerator.generateRandomArray(size,size);
            SortingHelper.sortTest("SelectionSort",arr);
        }
    }
}
