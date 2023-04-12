package com.example.bootsample.알고리즘.재귀;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class 바둑이승차 {

    /*
     * 철수는 그의 바둑이들을 데리고 시장에 가려고 한다. 그런데 그의 트럭은 C킬로그램을 넘게 태울수는 없다.
     * 철수는 C를 넘지 않으면서 그의 바둑이 들을 가장 무겁게 태우고 싶다.
     * N마리의 바둑이와 각 바둑이의 무게 W가 주어지면 철수가 트럭에 태울수 있는 가장 무거운 무게를 구하는 프로그램을 작성하시오
     *
     * */
    int n = 5;
    int limit = 259;

    int answer = 0;

    @Test
    void test(){


        int[] arr = {81, 58, 42, 33, 61};
        DFS(0,0,arr);
        System.out.println(answer);

    }


    void DFS(int L , int sum, int[] arr) {

        if(sum > limit) return;

        if(L == n) {
            answer = Math.max(answer,sum);
        } else {

            DFS(L+1, sum + arr[L], arr);
            DFS(L+1, sum, arr);

        }


    }



}
