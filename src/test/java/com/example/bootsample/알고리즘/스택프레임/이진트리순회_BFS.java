package com.example.bootsample.알고리즘.스택프레임;

import com.example.bootsample.알고리즘.재귀.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class 이진트리순회_BFS {


    Node root;

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
        BFS();
    }


    void BFS() {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int L = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            System.out.print(L + " : ");
            //이렇게 해줘야 레벨 안에서 처리가 가능하다.
            for (int i = 0; i < size; i++) {
                Node poll = queue.poll();

                System.out.print(poll.value + " ");

                if(poll != null) {
                    if(poll.lt != null) {
                        queue.offer(poll.lt);
                    }

                    if(poll.rt != null) {
                        queue.offer(poll.rt);
                    }

                }
            }
            System.out.println();

            L++;

        }
    }



    void BFS2() {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int L = 0;


        while (!queue.isEmpty()) {

            // 이렇게 하면 레벨을 탐색할수가 없다.
            Node poll = queue.poll();
            System.out.println(L + " : " );
            System.out.print(poll.value + " ");
            if(poll != null) {
                if(poll.lt != null) {
                    queue.offer(poll.lt);
                }

                if(poll.rt != null) {
                    queue.offer(poll.rt);
                }

            }

            L++;
        }
    }


}
