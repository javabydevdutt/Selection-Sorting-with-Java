package com.devdutt.sort.selection;

/*Time and space complexibility:-
worst time complexity:- O(N2) :- to find the minimum element at every iteration, we will have to traverse the entire unsorted array.
best time complexity:- O(n2):- to find the minimum element at every iteration, we will have to traverse the entire unsorted array.
*/

import java.util.Arrays;

public class SelectionSort {
    public static void sortSelection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }//if
            }//outer-for
        }//inner-for
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(arr));
    }//method

    public static void main(String[] args) {
        int[] arr = {6, 4, 5, 2, 7, 8, 10, 1, 3, 9};
        System.out.println("Before Sorting");
        System.out.print(Arrays.toString(arr));
        System.out.println();
        sortSelection(arr);
    }//main
}//class
