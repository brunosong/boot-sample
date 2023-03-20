package com.example.bootsample.알고리즘.정렬;

import org.junit.jupiter.api.Test;

public class LRU {

    /*
    *   1 0 0 0 0    1
    *   2 1 0 0 0    2
    *   3 2 1 0 0    3
    *   2 3 1 0 0    2
    *   6 2 3 1 0    6
    *   2 6 3 1 0    2
    *   3 2 6 1 0    3
    *   5 3 2 6 1    5
    *   7 5 3 2 6    7
    *
    * */


    @Test
    public void test(){

        //캐쉬
        int[] arr = {1 ,2 ,3 ,2 ,6 ,2 ,3 ,5 ,7};

        int[] cache = new int[5];

        for ( int x : arr ){

            int pos = -1;
            //현재 캐쉬로 쓸 자료가 있는지 찾아서 인덱스를 리턴한다.
            for (int i = 0; i < cache.length; i++) {
                if( x == cache[i] ) pos = i;
            }

            if (pos == -1){

                for(int i = cache.length - 1 ; i >= 1 ; i--){
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;
            } else {

                for(int i = pos ; i >= 1 ; i--){
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;

            }
        }

    }


}
