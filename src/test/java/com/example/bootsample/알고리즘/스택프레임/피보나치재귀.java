package com.example.bootsample.알고리즘.스택프레임;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 피보나치재귀 {

    int arr[];

    @Test
    void test(){
        int N = 5;
        arr = new int[N+1];

        System.out.println(DFS(N));
        System.out.println(Arrays.toString(arr));
    }


    int DFS(int N) {
        if (N == 1) {
            arr[N] = 1;
            return 1;
        } else if (N == 2) {
            arr[N] = 1;
            return 1;
        } else {
            if (arr[N] == 0){
                int result = DFS(N - 2) + DFS( N - 1);
                arr[N] = result;
                return result;
            }else{
                return arr[N];
            }

        }


    }
}
