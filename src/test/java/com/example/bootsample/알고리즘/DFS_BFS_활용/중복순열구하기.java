package com.example.bootsample.알고리즘.DFS_BFS_활용;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class 중복순열구하기 {

    int m = 2; //3까지의 순열
    int n = 3; //두가지
    int[] pm = new int[m];


    @Test
    void test(){
        DFS(0);
    }


    void DFS(int L) {
        if(L == m) {
            System.out.println(Arrays.toString(pm));
        } else {

            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                DFS(L+1);
            }

        }




    }

}
