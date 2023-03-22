package com.example.bootsample.알고리즘.재귀;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class 말단노드 {

    Node root;

    //깊이 우선 탐색
    @BeforeEach
    void setup(){
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);

        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);

    }

    @Test
    void test(){
        System.out.println(DFS(0, root));
    }

    int DFS(int level , Node root) {
        if(root.lt == null && root.rt == null) return level;

        return Math.min( DFS(level + 1,root.lt), DFS(level + 1,root.rt) );
    }


    @Test
    void test_BFS(){
        System.out.println(BFS(root));
    }

    int BFS(Node root) {

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {

                Node poll = queue.poll();

                if(poll.lt == null && poll.rt == null ) return level;
                if(poll.lt != null ) queue.offer(poll.lt);
                if(poll.rt != null ) queue.offer(poll.rt);

            }

            level++;
        }

        return 0;


    }



}
