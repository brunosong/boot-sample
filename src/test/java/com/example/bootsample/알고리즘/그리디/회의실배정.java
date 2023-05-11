package com.example.bootsample.알고리즘.그리디;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 회의실배정 {

    class MeetingRoom implements Comparable<MeetingRoom>{

        int s; //시작시간
        int l; //끝나는 시간

        public MeetingRoom(int s, int l) {
            this.s = s;
            this.l = l;
        }

        @Override
        public int compareTo(MeetingRoom o) {
            //정렬을 끝나는 시간으로 오름차순 정렬한다.
            if(this.l == o.l) return this.s - o.s;
            return this.l - o.l;
        }
    }


    /*

    회의실 배정
        한 개의 회의실이 있는데 이를 사용하고자 하는 n개의 회의들에 대하여 회의실 사용표를 만들
        려고 한다. 각 회의에 대해 시작시간과 끝나는 시간이 주어져 있고, 각 회의가 겹치지 않게 하
        면서 회의실을 사용할 수 있는 최대수의 회의를 찾아라. 단, 회의는 한번 시작하면 중간에 중
        단될 수 없으며 한 회의가 끝나는 것과 동시에 다음 회의가 시작될 수 있다.

    ▣ 입력설명
        첫째 줄에 회의의 수 n(1<=n<=100,000)이 주어진다. 둘째 줄부터 n+1 줄까지 각 회의의 정
        보가 주어지는데 이것은 공백을 사이에 두고 회의의 시작시간과 끝나는 시간이 주어진다.
        회의 시간은 0시부터 시작된다.
        회의의 시작시간과 끝나는 시간의 조건은 (시작시간 <= 끝나는 시간)입니다.

    ▣ 출력설명
        첫째 줄에 최대 사용할 수 있는 회의 수를 출력하여라.

    ▣ 입력예제 1
        5
        1 4
        2 3
        3 5
        4 6
        5 7

    ▣ 출력예제 1
        3

    예제설명
            (2, 3), (3, 5), (5, 7)이 회의실을 이용할 수 있다.

    ▣ 입력예제 2
        3
        3 3
        1 3
        2 3

    ▣ 출력예제 2
        2


    */


    // 포인트는 끝나는 시간으로 정렬을 하고 나서 시작을 해야한다.
    // 끝나는 시간이 같으면 시작시간으로 오름차순 정렬해야 한다.

    @Test
    void tesT(){
        int cnt = 0;
        List<MeetingRoom> list = new ArrayList<>();

        int[][] arr = {
                {3, 3},
                {1, 3},
                {2, 3}
        };

//        int[][] arr = { {1, 4},
//                        {2, 3},
//                        {3, 5},
//                        {4, 6},
//                        {5, 7}};

        for (int i = 0; i < arr.length; i++) {
            list.add(new MeetingRoom(arr[i][0] ,arr[i][1]));
        }

        Collections.sort(list);

//        int lastTime = list.get(0).l;
//        cnt++;
//
//        for (int i = 1; i < list.size(); i++) {
//            if(lastTime <= list.get(i).s) {
//                cnt++;
//                lastTime = list.get(i).l;
//            }
//        }

        int endTime = 0;
        for (MeetingRoom meetingRoom : list) {
            if(meetingRoom.s >= endTime) {
                endTime = meetingRoom.l;
                cnt++;
            }
        }

        System.out.println(cnt);
    }

}
