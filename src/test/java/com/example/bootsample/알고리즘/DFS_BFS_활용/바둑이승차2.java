package com.example.bootsample.알고리즘.DFS_BFS_활용;

import org.junit.jupiter.api.Test;

public class 바둑이승차2 {

    int max = Integer.MIN_VALUE;

    int n = 5;

    int[] arr = {81,58,42,33,61};

    int limit = 259;

    @Test
    void test() {

        DFS(0,0);

        System.out.println(max
        );
    }


    void DFS(int L , int sum){

        if(sum > limit) return;

        if(L == n) {
            max = Math.max(max,sum);
        } else {

            DFS(L+1,arr[L] + sum);
            DFS(L+1, sum);

        }



    }

}
