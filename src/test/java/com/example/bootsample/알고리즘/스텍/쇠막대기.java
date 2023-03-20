package com.example.bootsample.알고리즘.스텍;

import org.junit.jupiter.api.Test;

import java.util.Stack;

public class 쇠막대기 {

    @Test
    public void test(){

        String str = "()(((()())(())()))(())";

        Stack<Character> stack = new Stack<>();

        int answer = 0;

        char[] charArray = str.toCharArray();

        for(int i = 0 ; i < charArray.length ; i++ ){

            if(charArray[i] == '('){
                stack.push(charArray[i]);
            }else{
                stack.pop();

                if( charArray[i - 1] == '('){
                    answer += stack.size();
                }else{
                    answer++;
                }

            }


        }

        System.out.println(answer);

    }




}
