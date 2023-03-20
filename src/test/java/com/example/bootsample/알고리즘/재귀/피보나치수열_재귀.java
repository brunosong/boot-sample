package com.example.bootsample.알고리즘.재귀;

import org.junit.jupiter.api.Test;

public class 피보나치수열_재귀 {

    @Test
    void test(){
        int len = 40;

        int[] arr = new int[len+1];
        arr[1] = 1;
        arr[2] = 1;

        System.out.println(DFS(arr,len));

    }


    int DFS( int[] arr, int n ){
        if(arr[n] != 0){
            return arr[n];
        }
        return arr[n] = DFS(arr,n - 2) + DFS(arr,n - 1);
    }

}
