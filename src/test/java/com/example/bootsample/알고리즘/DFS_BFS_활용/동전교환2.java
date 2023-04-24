package com.example.bootsample.알고리즘.DFS_BFS_활용;

import org.junit.jupiter.api.Test;

public class 동전교환2 {

    int[] arr = {1 ,2 ,5};
    int target = 15;
    int n = 3;

    int answer = Integer.MAX_VALUE;

    @Test
    void test(){
        DFS(0,0);
    }


    void DFS(int L ,int sum) {

        //이 부분에서 L은 동전의 갯수로 생각하고
        //sum 은 동전의 총합으로 생각한다.

        if(sum > target) return;

        //현재 동전 갯수가 이미구한 최소 동전갯수보다 크면
        if(L > answer) return;

        //target 은 거실러 줘야 하는 돈
        if(sum == target){
            answer = Math.max(answer,L);
        } else {
            for (int i = 0; i < arr.length; i++) {
                DFS(L+1, arr[i] + sum);
            }

        }


    }



}
