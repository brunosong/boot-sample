package com.example.bootsample.알고리즘.그래프;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class 송아지찾기 {

    //넓이우선탐색 (BFS)
    int target = 14;
    int cur = 5;
    int[] dis = {1,-1,5};

    int[] ch = new int[10000];

    @Test
    void test(){

        ch[cur] = 1;
        System.out.println(BFS(cur));
    }


    int BFS(int v) {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);

        int L = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {

                Integer cv = queue.poll();

                for(int d : dis) {
                    int sum = cv + d;
                    if(ch[sum] == 0) {
                        if(sum == target) return L + 1;
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
