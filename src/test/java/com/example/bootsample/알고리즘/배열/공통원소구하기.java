package com.example.bootsample.알고리즘.배열;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 공통원소구하기 {

    /*
    * 공통원소 구하기
        A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로
        그램을 작성하세요.
    ▣ 입력설명
    첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
    두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
    세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
    네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
    각 집합의 원소는 1,000,000,000이하의 자연수입니다.

    ▣ 출력설명
        두 집합의 공통원소를 오름차순 정렬하여 출력합니다.

    ▣ 입력예제 1
        5
        1 3 9 5 2
        5
        3 2 5 7 8

    ▣ 출력예제 1
        2 3 5

    * */

    @Test
    public void test(){

        //Set을 사용하여 공통원소를 뽑을수도 있지만 지금은 투포인트 알고리즘을 사용한다.
        int[] a = {1,3,9,5,2};
        int[] b = {3,2,5,7,8};

        //투포인트는 정렬을 사용하여야 한다.
        Arrays.sort(a);
        Arrays.sort(b);

        int p1 = 0;
        int p2 = 0;

        List<Integer> list = new ArrayList<>();

        while (p1 < a.length && p2 < b.length) {

            if(a[p1] == b[p2]) {
                list.add(a[p1]);
                p1++;p2++;
            } else if ( a[p1] < b[p2] ){
                p1++;
            } else if ( a[p1] > b[p2] ){
                p2++;
            }

        }

    }
























}
