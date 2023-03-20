package com.example.bootsample.알고리즘.정렬;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class 선택정렬 {


    @Test
    public void solution(){

        int[] arr = { 5,4,2,1,6,3 };

        for (int i = 0; i < arr.length-1; i++) {

            int index = i;

            for(int j = i + 1; j < arr.length; j++){

                if(arr[index]  > arr[j]){
                    index = j;
                }

            }

            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

        }


        System.out.println(Arrays.toString(arr));


    }
}
