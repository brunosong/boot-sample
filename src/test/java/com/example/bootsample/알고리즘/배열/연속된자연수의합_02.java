package com.example.bootsample.알고리즘.배열;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class 연속된자연수의합_02 {
    //
    //    연속된 자연수의 합
    //    N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는
    //    방법의 가짓수를 출력하는 프로그램을 작성하세요.
    //        만약 N=15이면
    //        7+8=15
    //        4+5+6=15
    //        1+2+3+4+5=15
    //    와 같이 총 3가지의 경우가 존재한다.
    //  ▣ 입력설명
    //    첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.
    //            ▣ 출력설명
    //    첫 줄에 총 경우수를 출력합니다.
    //  ▣ 입력예제 1
    //            15

    //  ▣ 출력예제 1
    //            3



    @Test
    void test(){

        int N = 15;

        //이 문제를 풀기 위해서는 반을 나누고 +1 까지 가줘야 한다.
        //7+8이 있으니깐

        int nm = 15 / 2 + 1;

        int[] arr = new int[nm];

        for (int i = 0; i < nm; i++) arr[i] = i + 1;

        int lt = 0;
        int rt = 0;
        int sum = 0;
        int cnt = 0;

        for (rt = 0; rt < arr.length; rt++) {
            sum += arr[rt];
            if(sum == N) cnt++;
            while (sum >= N) {
                sum -= arr[lt++];
                if (sum == N) cnt++;
            }
        }

    }

}
