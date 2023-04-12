package com.example.bootsample.알고리즘.프로그래머스.lv1;

import org.junit.jupiter.api.Test;

public class 비밀지도 {


    @Test
    public void test(){


        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        int n = 5;
        // 출력	["#####","# # #", "### #", "# ##", "#####"]

        for (int i = 0; i < n; i++) {

            String a1 = Integer.toBinaryString(arr1[i]);

            a1 = String.format("%" + n + "s", a1);
            System.out.println(a1);


        }


    }

}
