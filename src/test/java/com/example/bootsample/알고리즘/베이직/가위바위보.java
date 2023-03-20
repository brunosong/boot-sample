package com.example.bootsample.알고리즘.베이직;

import org.junit.jupiter.api.Test;

public class 가위바위보 {

    @Test
    void test(){

        int[] A = {2, 3, 3, 1, 3};
        int[] B = {1, 1, 2, 2, 3};

        for (int i = 0; i < A.length; i++) {

            int a = A[i];
            int b = B[i];
            System.out.println(plus(a,b));
        }

    }

    String plus(int a, int b){

        if(a == 1 && b == 2) {
            //A : 가위 , B : 바위
            return "B";
        } else if (a == 2 && b == 3) {
            //A : 바위 , B : 바위
            return "B";
        } else if (a == 3 && b == 1) {
            //A가 보 B가 가위
            return "B";
        } else if (a == b) {
            //비겼을때
            return "D";
        } else {
            return "A";
        }


    }


}
