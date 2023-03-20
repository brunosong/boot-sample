package com.example.bootsample.알고리즘.정렬;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

public class 좌표정렬 {

    class Point implements Comparable<Point>{

        public int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point point) {

            //오름차순
//            if(this.x == point.x) return this.y - point.y;
//            else return this.x - point.x;

            //내림차순
            if(this.x == point.x) return point.y - this.y;
            else return point.x - this.x;

        }


    }

    @Test
    public void test(){

        ArrayList<Point> list = new ArrayList<>();

        list.add(new Point(2,7));
        list.add(new Point(1,3));
        list.add(new Point(1,2));
        list.add(new Point(2,5));
        list.add(new Point(3,6));

        Collections.sort(list);

        list.forEach(p -> {
            System.out.print(p.x);System.out.print( "," );System.out.print(p.y);
            System.out.println();
        });

    }




}
