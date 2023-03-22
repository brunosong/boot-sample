package com.example.bootsample.알고리즘.재귀;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class 송아지찾기 {

    //최단거리 구하기
    @Test
    void test(){
        BFS(5,14);
    }


    //송아지 위치는 14 , 출발 위치는 5 , 한번에 이동거리는 {1, -1, 5} 3가지 방향 , 최대 거리는 10000까지임
    int BFS(int e, int target){
        //위치를 기억하기 위해 배열을 사용한다.
        int[] ch = new int[10001];
        int[] dis =  {1, -1, 5};

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(e);
        ch[e] = 1;
        int L = 0;

        while (!queue.isEmpty()){

            int size = queue.size();
            for (int i = 0 ; i < size; i++){
                int value = queue.poll();

                for (int j : dis) {
                    int sum = value + j;

                    if(sum == target) return L;

                    if(sum >= 0 && sum <= 10000 && ch[sum] == 0) {
                        ch[sum] = 1;
                        queue.offer(sum);
                    }
                }
            }
            L++;
        }







        return 0;
    }






}
