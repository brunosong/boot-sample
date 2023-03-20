package com.example.bootsample.알고리즘.재귀;

import org.junit.jupiter.api.Test;

public class 팩토리얼 {

    @Test
    void test(){

        // 5 * 4 * 3 * 2 * 1
        System.out.println(solution(5));

    }

    int solution(int n){

        if( n == 1) return 1;
        else {
            int sum = n * solution(n - 1);
            return sum;
        }

    }


}
