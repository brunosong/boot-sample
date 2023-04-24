package com.example.bootsample.알고리즘.그래프;

import com.example.bootsample.알고리즘.재귀.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class 말단노드구하기 {

    Node root;

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
        // 자식 노드가 없는 것이 가장 첫번째 말단 노드가 되는것이다.
        System.out.println(BFS(root));

    }

    int BFS(Node root){

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int L = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node poll = queue.poll();
                if(poll.lt == null && poll.rt == null) return L;
                if(poll.lt != null ) queue.offer(poll.lt);
                if(poll.rt != null ) queue.offer(poll.rt);
            }
            L++;

        }

        return 0;


    }





}
