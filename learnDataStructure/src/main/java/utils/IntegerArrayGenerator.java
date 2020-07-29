package utils;

import java.util.Random;

public class IntegerArrayGenerator {

    private IntegerArrayGenerator(){}

    public static Integer[] generateOrderedArray(int n){
        Integer[] integerArray = new Integer[n];
        for (int i = 0;i<n;i++){
            integerArray[i] = i;
        }
        return integerArray;
    }

    public static Integer[] generateRandomArray(int arrLength,int bound){
        Integer[] integerArray = new Integer[arrLength];
        Random random = new Random(bound);
        for (int i = 0;i<arrLength;i++){
            integerArray[i] = random.nextInt();
        }
        return integerArray;
    }
}
