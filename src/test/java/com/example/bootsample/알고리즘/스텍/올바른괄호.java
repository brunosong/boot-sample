package com.example.bootsample.알고리즘.스텍;

import org.junit.jupiter.api.Test;

import java.util.Stack;

public class 올바른괄호 {

    @Test
    public void solution(){

        String str = "(()(()))()";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            if(stack.size() > 0 && str.charAt(i) == ')'){

                if(stack.peek() == '('){
                    stack.pop();
                }else{
                    stack.push(str.charAt(i));
                }

            }else{
                stack.push(str.charAt(i));
            }
        }

        System.out.println(stack.size());

    }


    @Test
    public void test2(){
        System.out.println(solution2());
    }


    public String solution2(){

        String answer = "YES";

        String str = "(()(()))(()";

        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()){
            if(x == '(') stack.push(x);
            else {
                if(stack.isEmpty()){
                    return "NO";
                }
                stack.pop();
            }
        }

        if(!stack.isEmpty()) return "NO";
        return answer;
    }
}
