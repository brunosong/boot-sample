package com.example.bootsample.알고리즘.배열;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class 두배열합치기 {
    
    @Test
    public void test(){
        
        //투포인트 알고리즘  투포인트 알고리즘은 정렬이 되어있어야 한다.
        int[] a = {1,3,5};
        int[] b = {2,3,6,7,9};

        int p1 = 0;
        int p2 = 0;

        List<Integer> list = new ArrayList<>();

        while (p1 < a.length && p2 < b.length) {

            if(a[p1] < b[p2]){
                list.add(a[p1]);
                p1++;
            }else {
                list.add(b[p2]);
                p2++;
            }

        }
        // while (p1 < a.length) list.add(a[p1++]); 이런식으로 가능
        if(p1 < a.length){
            for (int i = p1; i < a.length; i++) {
                list.add(a[i]);
            }
        }

        if(p2 < b.length){
            for (int i = p2; i < b.length; i++) {
                list.add(b[i]);
            }
        }

        System.out.println(
                list
        );
        
    }


    @Test
    void test2(){

        int[] a = {1,3,5};
        int[] b = {2,3,6,7,9};

        //투포인트 알고리즘으로 해결
        int p1 = 0;
        int p2 = 0;

        int aL = a.length;
        int bL = b.length;

        List<Integer> list = new ArrayList<>();

        while (p1 < aL && p2 < bL) {
            if(a[p1] < b[p2]) list.add(a[p1++]);
            else {
                list.add(b[p2++]);
            }
        }

        while (p1 < aL) list.add(a[p1++]);
        while (p2 < bL) list.add(b[p2++]);

        System.out.println(list);

    }



















    
}
