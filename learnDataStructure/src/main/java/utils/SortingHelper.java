package utils;

import algorithms.InsertionSort;
import algorithms.SelectionSort;

public class SortingHelper {
    public static <T extends Comparable<T>> boolean isSorted(T[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].compareTo(arr[i]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static <T extends Comparable<T>> void sortTest(String sortName,T[] arr) {

//        Integer[] arr = {95,3,0,7,88,5,66,88,2};
//        Integer[] randomArray = IntegerArrayGenerator.generateRandomArray(10000,100);
        T[] arr_sorted = null;
        long startTime = System.nanoTime();
        if (sortName.equalsIgnoreCase("SelectionSort")){
            arr_sorted = SelectionSort.sort(arr);
        }
        if (sortName.equalsIgnoreCase("InsertionSort")){
            arr_sorted = InsertionSort.sort(arr);
        }
        long endTime = System.nanoTime();
        double totalTime = (endTime - startTime)/1000000000.0;//单位：秒
        if (arr_sorted == null)
            throw new RuntimeException("arr_sorted is null");
        if (!SortingHelper.isSorted(arr_sorted)){
            throw new RuntimeException(sortName + " failed");
        }
        System.out.println(String.format("sortName : %s , arrLength : %d , totalTime : %f s",sortName,arr.length,totalTime));
//        for (Integer ele : arr_sorted){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
    }
}
