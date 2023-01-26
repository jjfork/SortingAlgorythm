package com.jakubiak.algorithms;
import org.apache.commons.lang3.ArrayUtils;
import java.lang.reflect.Array;

public class QuickSort implements SortingAlgorithm {
    @Override
    public  int[] sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    return arr;
}

    private  void sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int position = partition(arr, low, high);
        sort(arr, low, position - 1);
        sort(arr, position + 1, high);
        }


    private static int partition(int[] arr, int low, int high) {
        int pivotValue = arr[high];
        int i = low;
        int j = high - 1;
        while (i < j) {
            while (arr[i] < pivotValue) {
                i++;
            }
            while (j > low && arr[j] >= pivotValue){
                j--;
            }
            if (i < j) {
                ArrayUtils.swap(arr, i, j);
                i++;
                j++;
            }
        }
        if (i ==  j && arr[i] < pivotValue) {
           i++;
        }
        if (arr[i] != pivotValue) {
            ArrayUtils.swap(arr, i , high);
        }
        return i;
    }

//    private static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }

    @Override
    public String getAlgorithmName() {
        return QuickSort.class.getName();
    }
}
