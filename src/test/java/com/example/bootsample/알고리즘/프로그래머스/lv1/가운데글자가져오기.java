package com.example.bootsample.알고리즘.프로그래머스.lv1;

import org.junit.jupiter.api.Test;

public class 가운데글자가져오기 {
    /*
        단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
        재한사항
        s는 길이가 1 이상, 100이하인 스트링입니다.
     */

    @Test
    void test(){

        System.out.println(solution2("abcde"));

    }


    public String solution2(String s) {

        boolean isEven = s.length() % 2 == 0;

        StringBuilder sb = new StringBuilder();

        char[] charArray = s.toCharArray();

        if (isEven) {
            sb.append(charArray[charArray.length / 2 - 1]);
            sb.append(charArray[charArray.length / 2]);
        } else {
            sb.append(charArray[charArray.length / 2]);
        }

        return sb.toString();
    }



    public String solution(String s) {
        String answer = "";

        int sLen = s.length();


        if(sLen % 2 > 0){
            answer = s.substring(sLen / 2, sLen / 2 + 1);
        }else{

            int div = sLen / 2;

            String a = s.substring(div - 1 ,div);
            String b = s.substring(div,div + 1);

            answer = a + b;

        }

        return answer;
    }


}
