package com.example.bootsample.알고리즘.프로그래머스.lv1;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class 개인정보수집유효기간 {

    private static final int YEAR = 12;
    private static final int DAY = 28;

    @Test
    void test(){

//        today	terms	privacies	result
//        "2022.05.19"	["A 6", "B 12", "C 3"]	["2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"]	[1, 3]
//        "2020.01.01"	["Z 3", "D 5"]	["2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"]	[1, 4, 5]

        System.out.println(getDays("2022.02.20"));



    }


    public int[] solution(String today, String[] terms, String[] privacies) {

        int[] answer = {};

        Map<String,Integer> find = new HashMap<>();
        for(String str : terms) {
            find.put(str.split(" ")[0],Integer.parseInt(str.split(" ")[1]));
        }

        for(String str : privacies) {
            String[] s = str.split(" ");
            String date = s[0];
            String type = s[1];

            Integer integer = find.get(type);

        }

        return answer;



    }

    private int getDays(String date) {
        String[] a = date.split("\\.");
        int year = Integer.parseInt(a[0]);
        int month = Integer.parseInt(a[1]);
        int day = Integer.parseInt(a[2]);

        return (year * YEAR * DAY) + (month * DAY) + day;
    }


}
