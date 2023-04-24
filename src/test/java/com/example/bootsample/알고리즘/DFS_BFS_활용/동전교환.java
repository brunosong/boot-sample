package com.example.bootsample.알고리즘.DFS_BFS_활용;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

public class 동전교환 {
    /*
        동전교환
            다음과 같이 여러 단위의 동전들이 주어져 있을때 거스름돈을 가장 적은 수의 동전으로 교환
            해주려면 어떻게 주면 되는가? 각 단위의 동전은 무한정 쓸 수 있다.
        ▣ 입력설명
            첫 번째 줄에는 동전의 종류개수 N(1<=N<=12)이 주어진다. 두 번째 줄에는 N개의 동전의 종
            류가 주어지고, 그 다음줄에 거슬러 줄 금액 M(1<=M<=500)이 주어진다.
            각 동전의 종류는 100원을 넘지 않는다.
        ▣ 출력설명
            첫 번째 줄에 거슬러 줄 동전의 최소개수를 출력한다.
        ▣ 입력예제 1
        3
        1 2 5
        15

        ▣ 출력예제 1
        3
            설명 : 5 5 5 동전 3개로 거슬러 줄 수 있다.
    */
    Integer[] arr = {1,2,5};  //동전의 종류
    int target = 15;
    int answer = Integer.MAX_VALUE;

    @Test
    void test() {

        //큰것부터 구하면 더 빠른 시간복잡도를 구현할수 있다.
        Arrays.sort(arr, Collections.reverseOrder());

        DFS(0,0);
        System.out.println(answer);

    }

    void DFS(int L , int sum) {
        if(target < sum) return;
        if(L > answer) return;
        if(target == sum) {
            answer = Math.min(L,answer);
        } else {
            for (int i = 0; i < arr.length; i++) {
                DFS(L+1, sum + arr[i]);
            }
        }





    }


}
