package algorithms;

import utils.IntegerArrayGenerator;
import utils.SortingHelper;

/**
 * 插入排序（基于比较的插入排序）
 */
public class InsertionSort {
    private InsertionSort(){}
    public static <T extends Comparable<T>> T[] sort(T[] arr){
        for (int i = 0;i<arr.length;i++){
            for (int j = i;j >= 1;j--){
                if (arr[j].compareTo(arr[j-1])<0){
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }
        }
        return arr;
    }

    private static <T> void swap(T[] arr,int a,int b){
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {

        int[] dataSize = {10000,100000};
        for (int size : dataSize){
            Integer[] arr = IntegerArrayGenerator.generateRandomArray(size,size);
//            SortingHelper.sortTest("SelectionSort",arr);
            SortingHelper.sortTest("InsertionSort",arr);
        }
    }
}
