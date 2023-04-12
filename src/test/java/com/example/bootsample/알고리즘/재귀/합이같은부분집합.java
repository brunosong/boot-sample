package com.example.bootsample.알고리즘.재귀;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class 합이같은부분집합 {
    /*
    *  n개의 원소로 구성된 자연수 집합이 주어지면 이 집합을 두 개의 부분집합으로 나누었을 때 
    *  두 부분집합의 원소의 합이 서로 같은 경우가 존재하면 YES 그렇지 않으면 NO를 출력하는 프로그램을 작성하시오
    *  예를 들어
    *  {1,3,5,6,7,10} 입력되면 {1,3,5,7} = {6,10} 으로 두 부분집합의 합이 16으로 같은 경우가 존재하는 것을 알 수 있다.
    * 
    * */

    String answer = "NO";
    int n = 6 , total = 0;
    boolean flag = false;

    @Test
    void test(){
        int[] arr = {1,3,5,6,7,10};
        total = IntStream.of(arr).sum();
        DFS(0,0,arr);
        System.out.println(answer);
    }


    void DFS(int L , int sum, int[] arr) {
        if(flag) return;
        if(sum > (total / 2)) return;
        if(L == n) {

            if((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }

        } else {

            DFS(L+1, sum + arr[L] , arr);
            DFS(L+1, sum, arr);

        }






    }


}
