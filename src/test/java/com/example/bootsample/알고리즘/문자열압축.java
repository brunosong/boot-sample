package com.example.bootsample.알고리즘;

import org.junit.jupiter.api.Test;

public class 문자열압축 {


    @Test
    public void solution1(){

        String str = "KKHSSSSSSSSE";
        str += " ";  //마지막에 하나를 더 더해줘서 계산하기 쉬워지게 만들어준다.
        //결과를 K2HS7E로 만들어라

        char[] charArray = str.toCharArray();

        char temp = ' ';

        StringBuilder sb = new StringBuilder();

        int cnt = 1;

        for (int i = 0; i < charArray.length - 1; i++) {

            if (charArray[i] == charArray[i+1]) cnt++;
            else {
                if(cnt > 1){
                    sb.append(charArray[i] + "" + cnt);
                    cnt = 1;
                }else{
                    sb.append(charArray[i]);
                }
            }
        }

        System.out.println(sb);


    }
}
