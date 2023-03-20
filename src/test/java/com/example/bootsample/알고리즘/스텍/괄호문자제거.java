package com.example.bootsample.알고리즘.스텍;

import org.junit.jupiter.api.Test;

import java.util.Stack;

public class 괄호문자제거 {
    @Test
    public void test(){
        solution2("(A(BC)D)EF(G(H)(IJ)K)LM(N)");
    }

    public String solution(String str){

        String answer = "";

        Stack<Character> stack = new Stack<>();

        for(char x :str.toCharArray()){
            if( x != ')') stack.push(x);
            else{
                while (stack.peek() != '('){
                    stack.pop();
                }
                stack.pop();
            }

        }

        return answer;
    }


    public String solution2(String str){

        String answer = "";

        Stack<Character> stack = new Stack<>();

        for(char x :str.toCharArray()){
            if(x == ')') {
                while (stack.pop() != '(') {}  // 빼고 났는데 ( 면 참이라 빠져나온다 이미 빼고
            } else stack.push(x);
        }

        return answer;
    }



}
