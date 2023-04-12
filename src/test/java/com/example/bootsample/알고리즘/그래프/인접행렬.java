package com.example.bootsample.알고리즘.그래프;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 인접행렬 {

    int target = 5;
    int graphSize = 5;

    int answer = 0;

    int[][] graph = new int[graphSize + 1][graphSize + 1];

    int[] ch = new int[graphSize + 1];

    @Test
    void test(){



        int[][] arr =  { {1, 2}
                        ,{1, 3}
                        ,{1, 4}
                        ,{2, 1}
                        ,{2, 3}
                        ,{2, 5}
                        ,{3, 4}
                        ,{4, 2}
                        ,{4, 5} };



        for (int i = 0; i < arr.length; i++) {

            int left = arr[i][0];
            int right = arr[i][1];

            graph[left][right] = 1;

        }

//        for (int[] g : graph) {
//            System.out.println(Arrays.toString(g));
//        }

        ch[1] = 1;
        DFS(1);

    }

    void DFS(int v) {
        if(v == target) {
            System.out.println(Arrays.toString(ch));
            ch[v] = 0;
            answer++;
        } else {
            for (int i = 1; i <= graphSize; i++) {
                if(graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }
            }
        }


    }



}
