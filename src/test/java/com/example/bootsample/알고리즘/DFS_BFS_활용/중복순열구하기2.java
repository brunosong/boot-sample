package com.example.bootsample.알고리즘.DFS_BFS_활용;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class 중복순열구하기2 {

    int n = 3;
    int m = 2;
    int[] pm = new int[m];

    @Test
    void test(){
        DFS(0);
    }

    void DFS(int L){

        //이 레벨은 배열수 만큼 돌아야 한다.
        if(L == m) {
            System.out.println(Arrays.toString(pm));
        } else {

            for (int i = 1; i <= 3; i++) {
                pm[L] = i;
                DFS(L+1);
            }

        }



    }


}
