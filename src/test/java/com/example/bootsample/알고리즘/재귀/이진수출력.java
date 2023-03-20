package com.example.bootsample.알고리즘.재귀;

import org.junit.jupiter.api.Test;

public class 이진수출력 {

    @Test
    void test(){

        int n = 10;
        DFS(n);
    }


    void DFS(int n){

        if(n == 0) return;
        DFS(n / 2);
        System.out.println(n % 2);

    }
}
