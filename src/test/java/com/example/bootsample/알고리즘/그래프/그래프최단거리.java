package com.example.bootsample.알고리즘.그래프;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 그래프최단거리 {

    //넓이우선탐색 (BFS)

    int target = 6;
    int graphSize = 6;

    int answer = 0;

    ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    int[] ch = new int[target + 1];
    int[] dis = new int[target + 1];

    @Test
    void test(){


        int[][] arr = {
                 {1, 3}
                ,{1, 4}
                ,{2, 1}
                ,{2, 5}
                ,{3, 4}
                ,{4, 5}
                ,{4, 6}
                ,{6, 2}
                ,{6, 5}
        };

        for (int i = 0; i <= graphSize; i++) {
            graph.add(new ArrayList<>());
        }


        for (int i = 0; i < arr.length; i++) {

            int left = arr[i][0];
            int right = arr[i][1];

            graph.get(left).add(right);

        }

        BFS(1);
        //그래프 최단거리는 BFS로 하면 된다.
        System.out.println(Arrays.toString(dis));
    }

    void BFS(int v) {

        ch[v] = 1;
        dis[v] = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);

        while (!queue.isEmpty()) {

            Integer poll = queue.poll();
            for(int nv : graph.get(poll)){
                if(ch[nv] == 0) {
                    ch[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[poll] + 1;
                }
            }

        }




    }


}
