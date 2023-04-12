package com.example.bootsample.알고리즘.배열;

import org.junit.jupiter.api.Test;

public class 연속부분수열 {

//    N개의 수로 이루어진 수열이 주어집니다.
//    이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을
//    작성하세요.
//            만약 N=8, M=6이고 수열이 다음과 같다면
//    1 2 1 3 1 1 1 2
//    합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.

    @Test
    void test(){
        int[] arr = {1, 2, 1, 3, 1, 1, 1, 2};
        int m = 6;

        int p1 = 0;
        int p2 = 1;

        int sum = arr[p1];

        int cnt = 0;

        while (p2 != arr.length) {

            sum += arr[p2];

            if(sum == m) {
                cnt++;
                sum -= arr[p1];
                p1++;
            } else if (sum > m) {
                while (sum > m) {
                    sum -= arr[p1];
                    if(sum == m) {
                        cnt++;
                    }
                    p1++;
                }

            }

            p2++;
        }

        System.out.println(cnt);
    }



    @Test
    void test2(){
        int[] arr = {1, 2, 1, 3, 1, 1, 1, 2};
        int m = 6;

        int lt = 0 , rt;
        int sum = 0;
        int answer = 0;

        for (rt = 0; rt < arr.length; rt++) {
            sum += arr[rt];
            if( sum == m ) answer++;
            while (sum >= m) {
                sum -= arr[lt++];
                if(sum == m) answer++;
            }
        }


    }




}
