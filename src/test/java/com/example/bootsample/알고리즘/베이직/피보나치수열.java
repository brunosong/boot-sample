package com.example.bootsample.알고리즘.베이직;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 피보나치수열 {


    /*

      1) 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
      2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.

    */


    @Test
    void test(){
        int n = 10;

        int[] arr = new int[n];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }

        System.out.println(Arrays.toString(arr));

        solution(10);

        String testString = "String";

        IntStream intStream = testString.codePoints();
        intStream.forEach(System.out::println);

    }


    void solution(int n){

        int a = 1;
        int b = 1;
        int c = 0;

        System.out.print(a + " " +  b + " ");

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }



    }



}
