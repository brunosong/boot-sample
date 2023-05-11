package com.example.bootsample.알고리즘.DFS_BFS_활용;

import org.junit.jupiter.api.Test;

public class 조합의경우의수 {

    //메모이제이션 : 조합의 경우의 수는 nCr = n-1Cr-1 + n-1Cr
    // 피보나치랑 거의 비슷하다.

    int n = 33;
    int r = 19;

    int[][] dy = new int[n + 1][r + 1];

    @Test
    void test(){

        //5개 중에서 3개를 넣을수 있는 조합의 수를 구하라
        // n == r 인 이유는 3개 중에서 3개를 뽑는다라는 의미이기 때문에 1을 리턴해준다.
        System.out.println(DFS(n,r));

    }


    int DFS(int n , int r) {
        if(dy[n][r] > 0) return dy[n][r];
        if(n == r || r == 0) {
            return 1;
        }else{
            return dy[n][r] = DFS(n-1,r-1) + DFS(n-1, r);
        }

    }

}
