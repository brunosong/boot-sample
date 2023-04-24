package com.example.bootsample.알고리즘.DFS_BFS_활용;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class 순열구하기 {
    /*
        ▣ 입력설명
        첫 번째 줄에 자연수 N(3<=N<=10)과 M(2<=M<=N) 이 주어집니다.
        두 번째 줄에 N개의 자연수가 오름차순으로 주어집니다.

        ▣ 출력설명
        첫 번째 줄에 결과를 출력합니다.
        출력순서는 사전순으로 오름차순으로 출력합니다.

        ▣ 입력예제 1
        3 2
        3 6 9

        ▣ 출력예제 1
        3 6
        3 9
        6 3
        6 9
        9 3
        9 6
    */

    int[] arr = {3 ,6 ,9};
    int n = 2;
    int[] pm = new int[n];

    @Test
    void test(){
        DFS(0);
    }

    void DFS(int L){
        if(n == L) {
            System.out.println(Arrays.toString(pm));
        } else {

            for (int i = 0; i < arr.length; i++) {
                if (pm[0] != arr[i]){
                    pm[L] = arr[i];
                    DFS(L+1);
                }
            }
        }




    }




}
