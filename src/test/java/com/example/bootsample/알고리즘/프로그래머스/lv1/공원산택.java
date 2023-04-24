package com.example.bootsample.알고리즘.프로그래머스.lv1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class 공원산택 {


    @Test
    void test(){
        String[] park = {"SOO","OOO","OOO"};
        String[] routes = {"E 2","S 2","W 1"}; //	[2,1]
        //String[] park = {"SOO","OXX","OOO"};
        solution(park,routes);
        
        
    }
    

    public int[] solution(String[] park, String[] routes) {

        int[] answer = {};

        int[] curPo = new int[2];

        int[][] area = new int[park.length][park[1].length()];

        //좌표 생성
        for (int i = 0; i < park.length; i++) {
            String[] strings = park[i].split("");
            for (int j = 0; j < strings.length ; j++) {
                if( strings[j].equals("S") ) {
                    area[i][j] = 1;
                }

                if( strings[j].equals("X") ) {
                    area[i][j] = 2;
                }
            }
            
        }


        for (int i = 0; i < routes.length; i++) {
            String[] temp = routes[i].split(" ");

            String position = temp[0];
            String moveCnt = temp[1];

            switch ( position ) {
                case "E" : {
                    //서쪽 동쪽일때는 Y 좌표만 움직인다.

                    //북쪽 남쪽 일때는 X 좌표만 움직인다.
                }


            }




        }


        
        //현재위치 1 , 장애물 2

        

        for (int[] aaa : area) {
            System.out.println(Arrays.toString(aaa));
        }




        
        return answer;
    }
}
