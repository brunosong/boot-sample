package com.example.bootsample.알고리즘.스택프레임;

import org.junit.jupiter.api.Test;

public class 팩토리얼 {

    @Test
    void test(){
        System.out.println(fac(5));
    }


    int fac(int N) {
        if(N == 1) return 1;
        else {

            return N * fac(N -1 );

        }

    }
}
