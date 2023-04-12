package com.example.bootsample.알고리즘.재귀;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class 인접행렬 {

    int answer = 0;
    int n = 5;

    int[][] graph;
    int[] ch;

    int[][] m = {
            {1, 2},
            {1, 3},
            {1, 4},
            {2, 1},
            {2, 3},
            {2, 5},
            {3, 4},
            {4, 2},
            {4, 5}
    };

    ArrayList<ArrayList<Integer>> graphList = new ArrayList<>();

    @Test
    void test_arraylist(){

        for (int i = 0; i <= n; i++) {
            graphList.add(new ArrayList<>());
        }

        for (int i = 0; i < m.length; i++) {
            int a = m[i][0];
            int b = m[i][1];

            graphList.get(a).add(b);
        }

        ch = new int[n+1];
        ch[1] = 1;
        DFS_ARRAY(1);

    }

    void DFS_ARRAY(int v){
        if(v == n) answer++;
        else {
            for (int nv : graphList.get(v)) {
                if(ch[nv] == 0){
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }


    @Test
    void test(){


        graph = new int[n+1][n+1];

        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length; j++) {
                int a = m[i][0];
                int b = m[i][1];

                graph[a][b] = 1;

            }
        }

        for (int i = 0; i < graph.length; i++) {
            System.out.println(
                Arrays.toString(graph[i])
            );

        }

        ch = new int[n+1];
        ch[1] = 1;
        DFS(1);

        System.out.println(answer);
    }

    void DFS(int v){
        /* 이렇게 문제를 풀면 너무 많은 작업을 하게 된다. */
        if(v == n) answer++;
        else {
            for (int i = 1; i <= n ; i++) {
                if(graph[v][i] == 1 && ch[i] == 0){
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }
            }
        }
    }




}
