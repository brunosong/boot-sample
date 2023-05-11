package com.example.bootsample.알고리즘.그리디;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 씨름선수 {


    //정렬이 중요하다

    class Person implements Comparable<Person>{

        int h;
        int w;

        public Person(int h, int w) {
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(Person o) {
            //현재값이랑 비교를 해야한다.
            //내림차순을 하려면 this - o , 오름차순을 하려면 o - this
//            if( o.h == this.h) return o.w - this.w;
//            else return o.h - this.h;
            return o.h - this.h;
        }
    }

    //A라는 지원자를 다른 모든 지원자와 일대일 비교해서 키와 몸무게 모두 A지원자 보다 높은 
    // (크고,무겁다) 지원자가 존재하면 A 지원자는 탈락하고 그렇지 않으면 선발된다.
    // N명의 지원자가 주어지면 위의 선발원칙으로 최대 몇명의 선수를 선발할수 있는지 알아내느니 프로그램을 작성하시오


    /* 입력 예시 :

       172 67
       183 65
       180 70
       170 72
       181 60

     */


    @Test
    void test(){

        int cnt = 0;

        List<Person> list = new ArrayList<>();
        int[][] arr = { {172, 67},
                        {183, 65},
                        {180, 70},
                        {170, 72},
                        {181, 60}};

        for (int i = 0; i < arr.length; i++) {
            list.add(new Person(arr[i][0] ,arr[i][1]));
        }

        Collections.sort(list);

        int max = Integer.MIN_VALUE;

        for (Person person : list) {
            if(max < person.w) {
                max = person.w;
                cnt++;
            }
        }

        System.out.println(cnt);

        for (Person person : list) {
            System.out.print(person.h + " ");
            System.out.print(person.w);
            System.out.println();
        }

    }




}
