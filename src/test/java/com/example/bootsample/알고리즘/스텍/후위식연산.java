package com.example.bootsample.알고리즘.스텍;

import org.junit.jupiter.api.Test;

import java.util.Stack;

public class 후위식연산 {


    @Test
    void test(){

        // 3 * ( 5 + 2 ) - 9
        String str = "352+*9-";


        Stack<Integer> stack = new Stack<>();

        for(char c : str.toCharArray()) {

            if(Character.isDigit(c)){
                stack.push(Character.getNumericValue(c));
            } else {

                int r = stack.pop();
                int l = stack.pop();

                if ( c == '*') stack.push(l * r);
                else if (c == '+') {
                    stack.push(l + r);
                } else if (c == '-') {
                    stack.push(l - r);
                }
            }

        }

        System.out.println(stack);

    }

}
