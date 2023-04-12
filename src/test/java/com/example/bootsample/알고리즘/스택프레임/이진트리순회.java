package com.example.bootsample.알고리즘.스택프레임;

import com.example.bootsample.알고리즘.재귀.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 이진트리순회 {

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
        DFS(root);
    }

    void DFS(Node root) {
        if(root == null) return;
        else {
            DFS(root.lt);
            System.out.print(root.value + " ");
            DFS(root.rt);
        }
    }



}
