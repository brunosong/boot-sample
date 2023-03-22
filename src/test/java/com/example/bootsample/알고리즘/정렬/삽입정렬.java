package com.example.bootsample.알고리즘.정렬;

import org.junit.jupiter.api.Test;

public class 삽입정렬 {

    @Test
    void test(){

        int[] arr = { 5,4,2,1,6,3 };

        //삽입정렬은 1부터 시작을 한다.
        for (int i = 1; i < arr.length; i++) {

            int temp = arr[i];
            int j = i-1;

            for (; j >= 0; j--) {
                if(arr[j] > temp){
                    arr[j+1] = arr[j];
                } else break;

            }
            arr[j+1] = temp;

        }




    }


}
