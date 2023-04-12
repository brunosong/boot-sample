package com.example.bootsample.알고리즘.배열;

import org.junit.jupiter.api.Test;

public class 연속된자연수의합 {

    @Test
    public void test(){
        /*
        * 15를 넣으면 7+8 ,1+2+3+4+5 , 등등 몇개가 되는지 찾아라
        *
        * */

        int num = 15;
        int target = (num / 2) + 1;

        int[] arr = new int[target];

        for (int i = 0; i < target; i++) arr[i] = i+1;
        //일단 이거를 하려면 저 숫자에 나누기 2를 하고 +1까지 해주면 된다.

        int lt = 0;

        int sum = 0;
        int answer = 0;

        for (int rt = 0; rt < arr.length; rt++) {
            sum += arr[rt];
            if (sum == num) answer++;
            else {
                while (sum >= num){
                    sum -= arr[lt++];
                }

                if(sum == num) answer++;

            }
        }

    }



    @Test
    public void test2(){

        int n = 15;
        /* 수학적인 방식으로 풀기 */
        int answer = 0, cnt = 1;
        n--;
        while (n > 0){
            cnt++;
            n = n - cnt;
            if(n % cnt == 0){
                answer++;
            }
        }

        System.out.println(answer);
    }


}
