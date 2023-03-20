package com.example.bootsample.알고리즘.재귀;

import org.junit.jupiter.api.Test;

public class 재귀함수 {


    @Test
    public void test(){
        DFS(3);

    }

    void DFS(int n){

        if(n == 0) {
            return;
        }else{
            DFS(n - 1);
            System.out.println(n);
        }

    }

}
