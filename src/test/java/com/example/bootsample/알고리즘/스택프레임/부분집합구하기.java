package com.example.bootsample.알고리즘.스택프레임;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class 부분집합구하기 {
    /*
     부분집합이란 2에 N승을 해도 값이 나옴.. 대신 이렇게 하면 공집합이 포함됨 {1,2,3}
     이렇게 있으면 1이 포함이 될수도 2가 포함이 될수도 3이 포함이 될수도 있기때문에 7가지 케이스가 나온다.

    */
    int N = 3;
    int[] ch;

    @Test
    void test(){
        ch = new int[N + 1];
        DFS(1);
    }



    void DFS(int L){
        if ( L == N + 1 ) {
            System.out.println(Arrays.toString(ch));
        } else {

            ch[L] = 1;
            DFS(L + 1);
            ch[L] = 0;
            DFS(L + 1);

        }




    }



}
