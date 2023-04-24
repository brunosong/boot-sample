package com.example.bootsample.알고리즘.프로그래머스.lv1;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 추억점수 {
    /*

    사진들을 보며 추억에 젖어 있던 루는 사진별로 추억 점수를 매길려고 합니다. 사진 속에 나오는 인물의 그리움 점수를 모두 합산한 값이 해당 사진의 추억 점수가 됩니다.
    예를 들어 사진 속 인물의 이름이 ["may", "kein", "kain"]이고 각 인물의 그리움 점수가 [5점, 10점, 1점]일 때 해당 사진의 추억 점수는 16(5 + 10 + 1)점이 됩니다.
    다른 사진 속 인물의 이름이 ["kali", "mari", "don", "tony"]이고 ["kali", "mari", "don"]의 그리움 점수가 각각 [11점, 1점, 55점]]이고, "tony"는 그리움 점수가 없을 때,
    이 사진의 추억 점수는 3명의 그리움 점수를 합한 67(11 + 1 + 55)점입니다.

    그리워하는 사람의 이름을 담은 문자열 배열 name, 각 사람별 그리움 점수를 담은 정수 배열 yearning,
    각 사진에 찍힌 인물의 이름을 담은 이차원 문자열 배열 photo가 매개변수로 주어질 때, 사진들의 추억 점수를 photo에 주어진 순서대로 배열에
    담아 return하는 solution 함수를 완성해주세요.

    제한사항
    3 ≤ name의 길이 = yearning의 길이≤ 100
                3 ≤ name의 원소의 길이 ≤ 7
        name의 원소들은 알파벳 소문자로만 이루어져 있습니다.
        name에는 중복된 값이 들어가지 않습니다.

    1 ≤ yearning[i] ≤ 100
        yearning[i]는 i번째 사람의 그리움 점수입니다.
    3 ≤ photo의 길이 ≤ 100
                1 ≤ photo[i]의 길이 ≤ 100
                3 ≤ photo[i]의 원소(문자열)의 길이 ≤ 7
        photo[i]의 원소들은 알파벳 소문자로만 이루어져 있습니다.
        photo[i]의 원소들은 중복된 값이 들어가지 않습니다.

    */

    /*

    입출력 예
        name	yearning	photo	result
        ["may", "kein", "kain", "radi"]	[5, 10, 1, 3]	[["may", "kein", "kain", "radi"],["may", "kein", "brin", "deny"], ["kon", "kain", "may", "coni"]]	[19, 15, 6]
        ["kali", "mari", "don"]	[11, 1, 55]	[["kali", "mari", "don"], ["pony", "tom", "teddy"], ["con", "mona", "don"]]	[67, 0, 55]
        ["may", "kein", "kain", "radi"]	[5, 10, 1, 3]	[["may"],["kein", "deny", "may"], ["kon", "coni"]]	[5, 15, 0]
    */


    @Test
    void test(){
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = { 5, 10, 1, 3 };
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        solution3(name,yearning,photo);


    }

    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String,Integer> nameMap = new HashMap<>();

        for (int i = 0; i < name.length; i++) nameMap.put(name[i],yearning[i]);

        int in = 0;
        for (String[] users : photo) {

            int sum = 0;

            for (int i = 0; i < users.length; i++) {
                String n = users[i];
                if(nameMap.containsKey(n)){
                    sum += nameMap.get(n);
                }
            }

            System.out.println(sum);
            answer[in] = sum;
            in++;
        }


        System.out.println(Arrays.toString(answer));

        return answer;
    }


    public int[] solution2(String[] name, int[] yearning, String[][] photo) {

        Map<String, Integer> map = IntStream.range(0, name.length)
                .mapToObj(operand -> Map.entry(name[operand], yearning[operand]))
                .collect(Collectors.toSet())
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        return Arrays.stream(photo).mapToInt( strings -> Arrays.stream(strings).mapToInt(value -> map.getOrDefault(value, 0)).sum()).toArray();
    }



    public int[] solution3(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String,Integer> nameMap = new HashMap<>();

        for (int i = 0; i < name.length; i++) nameMap.put(name[i],yearning[i]);

        Arrays.stream(photo).mapToInt( k -> {
              //return Arrays.stream(k).filter(u -> nameMap.containsKey(u))
              return Arrays.stream(k).mapToInt(u -> nameMap.getOrDefault(u,0)).sum();
        }).toArray();


        Arrays.stream(photo).mapToInt( k -> {
            return Arrays.stream(k).filter(u -> nameMap.containsKey(u))
                    .mapToInt(u -> nameMap.get(u))
                    .sum();
        });


        for (int i = 0; i < photo.length; i++) {

            int sum = Arrays.stream(photo[i]).filter(u -> nameMap.containsKey(u))
                    .mapToInt(u -> nameMap.get(u))
                    .sum();

            answer[i] = sum;
        }


        System.out.println(Arrays.toString(answer));

        return answer;
    }


}
