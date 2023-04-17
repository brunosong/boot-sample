package com.example.bootsample.알고리즘.그래프;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class 인접리스트 {

    int target = 5;
    int graphSize = 5;

    int answer = 0;

    ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    int[] ch = new int[graphSize + 1];

    @Test
    void test() {

        int[][] arr = {{1, 2}
                , {1, 3}
                , {1, 4}
                , {2, 1}
                , {2, 3}
                , {2, 5}
                , {3, 4}
                , {4, 2}
                , {4, 5}};

        for (int i = 0; i <= graphSize; i++) {
            graph.add(new ArrayList<>());
        }


        for (int i = 0; i < arr.length; i++) {

            int left = arr[i][0];
            int right = arr[i][1];

            graph.get(left).add(right);

        }

        System.out.println(graph);

        ch[1] = 1;
        DFS(1);

        System.out.println(answer);
    }


    void DFS(int v) {

        if( v == target ) {
            answer++;
        } else {

            for ( int i : graph.get(v) ) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }
            }
        }
    }



}
