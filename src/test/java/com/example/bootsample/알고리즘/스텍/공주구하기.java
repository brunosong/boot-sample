package com.example.bootsample.알고리즘.스텍;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class 공주구하기 {


    /*
    *
    *   정보 왕국의 이웃 나라 외동딸 공주가 숲속의 괴물에게 잡혀갔습니다.

        정보 왕국에는 왕자가 N명이 있는데 서로 공주를 구하러 가겠다고 합니다.

        정보왕국의 왕은 다음과 같은 방법으로 공주를 구하러 갈 왕자를 결정하기로 했습니다.

        왕은 왕자들을 나이 순으로 1번부터 N번까지 차례로 번호를 매긴다.

        그리고 1번 왕자부터 N번 왕자까지 순서대로 시계 방향으로 돌아가며 동그랗게 앉게 한다.

        그리고 1번 왕자부터 시계방향으로 돌아가며 1부터 시작하여 번호를 외치게 한다.

        한 왕자가 K(특정숫자)를 외치면 그 왕자는 공주를 구하러 가는데서 제외되고 원 밖으로 나오게 된다.

        그리고 다음 왕자부터 다시 1부터 시작하여 번호를 외친다.

        이렇게 해서 마지막까지 남은 왕자가 공주를 구하러 갈 수 있다.

        예를 들어 총 8명의 왕자가 있고, 3을 외친 왕자가 제외된다고 하자. 처음에는 3번 왕자가 3을 외쳐 제외된다.

        이어 6, 1, 5, 2, 8, 4번 왕자가 차례대로 제외되고 마지막까지 남게 된 7번 왕자에게 공주를 구하러갑니다.


    * */

    @Test
    public void test(){
        
        int count = 8; //왕자에 수
        int target = 3; //탈락할 순번
        
        
        //큐에 넣어서 처리
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= count; i++) {
            queue.offer(i);
        }

        int cnt = 1;

        while (queue.size() > 1){
            Integer poll = queue.poll();

            if(cnt == target){
                cnt = 1;
            }else {
                cnt++;
                queue.offer(poll);
            }
        }
    }



    @Test
    public void test2(){

        int count = 8; //왕자에 수
        int target = 3; //탈락할 순번

        //큐에 넣어서 처리
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= count; i++) {
            queue.offer(i);
        }

        int answer = 0;

        while (!queue.isEmpty()){
            for (int i = 1; i < target; i++) queue.offer(queue.poll());
            queue.poll();
            if(queue.size() == 1) answer = queue.poll();
        }

        System.out.println(answer);

    }
}
