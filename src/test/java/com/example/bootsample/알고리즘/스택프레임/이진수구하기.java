package com.example.bootsample.알고리즘.스택프레임;

import org.junit.jupiter.api.Test;

public class 이진수구하기 {

    @Test
    void test(){

        int N = 10;

        DFS(N);

    }


    void DFS(int N) {
        if( N == 0 ) return;
        else {
            DFS(N / 2);
            System.out.println(N % 2);
        }




    }


}
