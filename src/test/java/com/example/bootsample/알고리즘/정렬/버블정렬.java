package com.example.bootsample.알고리즘.정렬;

import org.junit.jupiter.api.Test;

public class 버블정렬 {

    @Test
    public void test(){

        int[] arr = { 5,4,2,1,6,3 };

        for (int i = 1; i < arr.length; i++) {

            for (int j = 0; j < arr.length - i ; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


    }


}
