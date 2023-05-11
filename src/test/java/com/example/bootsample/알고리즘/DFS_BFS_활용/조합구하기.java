package com.example.bootsample.알고리즘.DFS_BFS_활용;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class 조합구하기 {

    /*

        조합 구하기

        1부터 N까지 번호가 적힌 구슬이 있습니다. 이 중 M개를 뽑는 방법의 수를 출력하는 프로그램을 작성하세요.

        ▣ 입력설명
        첫 번째 줄에 자연수 N(3<=N<=10)과 M(2<=M<=N) 이 주어집니다.

        ▣ 출력설명
        첫 번째 줄에 결과를 출력합니다.

        출력순서는 사전순으로 오름차순으로 출력합니다.

     */

    int n = 4;
    int m = 2;
    int[] pm = new int[m];
    //수열을 구하는 방법이랑 비슷하다.
    //수열의 깊이 값은 레벨이랑 같다

    @Test
    void test(){

        DFS(0,1);

    }


    void DFS(int L , int s) {
        if(L == m) {
            System.out.println(
                Arrays.toString(pm)
            );
        } else {
            for (int i = s; i <= n; i++) {
                pm[L] = i;
                DFS(L + 1 , i + 1);
            }
        }

    }






}
