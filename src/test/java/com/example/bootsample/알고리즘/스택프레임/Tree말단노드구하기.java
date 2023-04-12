package com.example.bootsample.알고리즘.스택프레임;

import com.example.bootsample.알고리즘.재귀.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class Tree말단노드구하기 {
    /*
        Tree 말단 노드까지의 가장 짧은 경로
        아래 그림과 같은 이진트리에서 루트 노드 1에서 말단노드까지의 길이 중 가장 짧은 길이를
        구하는 프로그램을 작성하세요.
        각 경로의 길이는 루트노드에서 말단노드까지 가는데 이동하는 횟수를 즉 간선(에지)의 개수를
        길이로 하겠습니다.

     */

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
        System.out.println(BFS());
    }


    int BFS() {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int L = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {
                //가장 짧은 노드를 구해야 하기때문에 자식이 둘다 없는 놈을 구하면 된다.
                Node cur = queue.poll();
                if(cur.lt == null && cur.rt == null) return L;
                if(cur.lt != null) queue.offer(cur.lt);
                if(cur.rt != null) queue.offer(cur.rt);

            }
            L++;

        }

        return L;

    }






}
