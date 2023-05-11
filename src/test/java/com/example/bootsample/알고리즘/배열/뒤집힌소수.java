package com.example.bootsample.알고리즘.배열;

import org.junit.jupiter.api.Test;

public class 뒤집힌소수 {
    /*
        뒤집은 소수
        N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하
        는 프로그램을 작성하세요. 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출
        력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다. 첫 자리부터의 연속된 0은 무시한다.

        ▣ 입력설명
        첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
        각 자연수의 크기는 100,000를 넘지 않는다.

        ▣ 출력설명
        첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.

        ▣ 입력예제 1
        9
        32 55 62 20 250 370 200 30 100

        ▣ 출력예제 1
        23 2 73 2 3

    */

    int[] arr = {32 ,55 ,62 ,20 ,250, 370, 200, 30, 100};


    @Test
    void test() {

        for (int i = 0; i < arr.length; i++) {

            int n = arr[i];

            //숫자 뒤집기 (while 로 쌉조져주기)
            int tmp = 0;
            int res = 0;

            while (n > 0) {
                tmp = n % 10;
                res = res * 10 + tmp;
                n = n / 10;
            }

            if(isPrime(res)){
                System.out.println( res + " 소수입니다.");
            }


        }
    }

    boolean isPrime(int num) {

        if( num == 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if(num % i == 0) return false;

        }

        return true;

    }



}
