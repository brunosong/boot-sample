package com.example.bootsample.알고리즘.배열;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 공통원소구하기 {

    @Test
    public void test(){

        List<Integer> answer = new ArrayList<>();

        int[] a ={ 1, 3, 9, 5, 2 };
        int[] b ={ 3, 2, 5, 7, 8 };

        //투포인트로 해보자 hashset으로 처리하면 간단함

        int p1 = 0;
        int p2 = 0;

        Arrays.sort(a);
        Arrays.sort(b);

        while (p1 < a.length && p2 < b.length){

            if(a[p1] == b[p2]){
                answer.add(a[p1]);
                p1++; p2++;
            }else if(a[p1] < b[p2]){
                p1++;
            }else if(a[p1] > b[p2]){
                p2++;
            }

        }

    }


}
