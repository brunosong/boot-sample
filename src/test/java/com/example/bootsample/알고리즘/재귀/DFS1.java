package com.example.bootsample.알고리즘.재귀;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DFS1 {

    Node root;

    //깊이 우선 탐색
    @BeforeEach
    void setup(){
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);

        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);

        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
    }

    @Test
    void test(){

        DFS(root);

    }

    /* 깊이 우선 탐색 */
    void DFS(Node node) {
        if(node == null) return ;
        else {

            DFS(node.lt);
            System.out.println(node.value);
            DFS(node.rt);

        }
    }

    int n = 3;
    int[] ch = new int[n+1];

    @Test
    void test2(){
        // 1,2,3 의 부분 집합을 구하여라 부분집한 구하는 공식은 2에 n제곱
        DFS2(1);

    }

    /* 부분 집합 */
    void DFS2(int L){
        if(n + 1 == L) {
            System.out.println(Arrays.toString(ch));
            return;
        } else {
            ch[L] = 1;
            DFS2(L + 1);
            ch[L] = 0;
            DFS2(L + 1);
        }

    }


    @Test
    void BFS_TEST(){
        /* 넓이 우선 탐색 (레벨 탐색) 레벨별로 값을 탐색을 한다. 큐를 이용해서 사용 */
        BFS();

    }

    void BFS() {

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;

        while (!queue.isEmpty()) {
            System.out.println("level : " + level);
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node poll = queue.poll();
                System.out.println(poll.value);
                if(poll.lt != null ) queue.offer(poll.lt);
                if(poll.rt != null ) queue.offer(poll.rt);

            }

            level++;
            System.out.println();

        }



    }





}
