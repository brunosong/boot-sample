package com.example.bootsample.알고리즘.재귀;

import org.junit.jupiter.api.Test;

public class 팩토리얼2 {

    @Test
    void test(){

        //팩토리얼은 5 * 4 * 3 * 2 * 1 = 결과출력

        System.out.println(fac(5));

    }

    int fac(int n){

        if ( n == 1) {
            return 1;
        } else {
            int sum = n * fac(n - 1);
            return sum;
        }

    }

    //재귀피보나치
    @Test
    void test2(){
        System.out.println(fibo(6));
    }


    int fibo(int n){

        if( n == 1 || n == 2 ){
            return 1;
        }
        return fibo(n - 1) + fibo( n - 2);


    }







}
