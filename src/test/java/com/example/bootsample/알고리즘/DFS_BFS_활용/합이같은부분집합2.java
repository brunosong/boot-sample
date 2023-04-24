package com.example.bootsample.알고리즘.DFS_BFS_활용;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class 합이같은부분집합2 {


    int[] arr = {1,3,5,6,7,10};
    int total = 0;

    int n = arr.length;

    int sum = 0;

    boolean flag = false;

    String answer = "NO";

    @Test
    void test(){
        total = Arrays.stream(arr).sum();

        DFS(0,0);

    }

    void DFS(int L, int sum) {
        if(false) return;
        if(sum > total / 2) return;

        if(L == n) {
            if(sum == total / 2) {
                answer = "YES";
                flag = true;
            }
        } else {

            DFS(L + 1, arr[L] + sum );
            DFS(L + 1, sum );


        }




    }



}
