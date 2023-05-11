package com.example.bootsample.알고리즘.그리디;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 결혼식 {

    /* 그리디 알고리즘에 포인트는 정렬이다. */
    /*

    결혼식
    현수는 다음 달에 결혼을 합니다.
    현수는 결혼식 피로연을 장소를 빌려 3일간 쉬지 않고 하려고 합니다.
    피로연에 참석하는 친구들 N명의 참석하는 시간정보를 현수는 친구들에게 미리 요구했습니다.
    각 친구들은 자신이 몇 시에 도착해서 몇 시에 떠날 것인지 현수에게 알려주었습니다.
    현수는 이 정보를 바탕으로 피로연 장소에 동시에 존재하는 최대 인원수를 구하여 그 인원을
    수용할 수 있는 장소를 빌리려고 합니다. 여러분이 현수를 도와주세요.
    만약 한 친구가 오는 시간 13, 가는시간 15라면 이 친구는 13시 정각에 피로연 장에 존재하는
    것이고 15시 정각에는 존재하지 않는다고 가정합니다.

    ▣ 입력설명
    첫째 줄에 피로연에 참석할 인원수 N(5<=N<=100,000)이 주어집니다.
    두 번째 줄부터 N줄에 걸쳐 각 인원의 오는 시간과 가는 시간이 주어집니다.
    시간은 첫날 0시를 0으로 해서 마지막날 밤 12시를 72로 하는 타임라인으로 오는 시간과 가
    는 시간이 음이 아닌 정수로 표현됩니다.

    ▣ 출력설명
    첫째 줄에 피로연장에 동시에 존재하는 최대 인원을 출력하세요.

    ▣ 입력예제 1
    5
    14 18
    12 15
    15 20
    20 30
    5 14
    ▣ 출력예제 1
    2
    */

    //문제를 푸는 방법은 시작한 시간을 's'로 끝나는 시간을 'e' 로 만들어 둔 후
    class Time implements Comparable<Time>{
        int time;
        char state;

        public Time(int time, char state) {
            this.time = time;
            this.state = state;
        }

        @Override
        public int compareTo(Time o) {
            //일단 타임으로 오름 차순 정렬을 해야 한다.
            if(this.time == o.time) {
                return this.state - o.state;
            }

            return this.time - o.time;
        }
    }




    @Test
    void test(){

        List<Time> list = new ArrayList<>();

        int[][] arr = { {14, 18},
                        {12, 15},
                        {15, 20},
                        {20, 30},
                        {5 ,14}};

        for (int i = 0; i < arr.length; i++) {

            list.add(new Time(arr[i][0],'s'));
            list.add(new Time(arr[i][1],'e'));

        }

        Collections.sort(list);

        int cnt = 0;
        int answer = Integer.MIN_VALUE;

        for (Time time : list) {

            if( time.state == 's') cnt++;
            else cnt--;

            //if(cnt > answer)  answer = cnt;
            answer = Math.max(answer,cnt);

        }

        System.out.println(answer);


    }

}
