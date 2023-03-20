package com.example.bootsample.알고리즘.베이직;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 가장짧은문자거리 {


    @Test
    void test(){
        String str = "teachermode";
        char target = 'e';

        int[] arr = new int[str.length()];

        int P = 1000;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target) P = 0;
            else {
                P++;
                arr[i] = P;
            }
        }

        P = 1000;

        for (int i = arr.length - 1; i >= 0 ; i--) {
            if(arr[i] == 0) P = 0;
            else {
                P++;
//                if(arr[i] > P){
//                    arr[i] = P;
//                }
                arr[i] = Math.min(arr[i] , P);
            }
        }


        System.out.println(Arrays.toString(arr));

    }


    @Test
    void 문자열() {
        String s = "taaechermode";

        ArrayList<Integer> indexArr = new ArrayList<>();

        // e를 가지는 index 알기
        for (int i = 0; i < s.toCharArray().length; i++) {
            if(s.toCharArray()[i] == 'e') {
                indexArr.add(i);
            }
        }

        // e의 index를 가지고 문자열의 거리 알기
        int[][] stringsIndexArr = new int[indexArr.size()][s.length()];

        for (int i = 0; i < indexArr.size(); i++) {

            for (int j = 0; j < s.length(); j++) {

                int indexNum = j - indexArr.get(i);
                if(indexNum < 0) {
                    indexNum = -indexNum;
                }

                switch(i) {
                    case 0 :
                        stringsIndexArr[i][j] = indexNum;
                        break;
                    case 1 :
                        if(stringsIndexArr[i-1][j] < indexNum) {
                            stringsIndexArr[i][j] = stringsIndexArr[i-1][j];
                        } else {
                            stringsIndexArr[i][j] = indexNum;
                        }
                        break;
                    case 2 :
                        if(stringsIndexArr[i-1][j] < indexNum) {
                            stringsIndexArr[i][j] = stringsIndexArr[i-1][j];
                        } else {
                            stringsIndexArr[i][j] = indexNum;
                        }
                        break;
                }
            }

        }

        System.out.println("결과값" + Arrays.toString(stringsIndexArr[2]));


    }

}
