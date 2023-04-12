package com.example.bootsample.java.람다식.example02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class LamdaEx3 {


    @Test
    void consumerEx(){

        Consumer<String> consumer = ( s ) -> {
            System.out.println(s);
        };

        consumer.accept("안녕하세요");

        BiConsumer<String,Integer> biconsumer = ( s, i) -> {
            System.out.println(s);
            System.out.println(i);
        };

        biconsumer.accept("안녕", 20);


    }


    @Test
    void supplierEx(){
        //공급자라고 함
        Supplier<String> supplier = () -> "안녕";

        System.out.println(supplier.get());


        IntSupplier intSupplier = () -> {
            return (int)(Math.random() * 45) + 1 ;
        };

        int asInt = intSupplier.getAsInt();
        System.out.println(asInt);
        System.out.println(intSupplier.getAsInt());
        System.out.println(intSupplier.getAsInt());


    }

    private List<Student> list = Arrays.asList(
        new Student("A",10, 9 ),
        new Student("B",20, 9 ),
        new Student("C",30, 9 ),
        new Student("D",40, 9 )
    );

    private List<Student> arraylist = new ArrayList<>();

    @Test
    void functionEx() {

        printString( ( s ) -> {
            return s.getName();
        } );

        printInt( ( s ) -> {
            return s.getMathScore();
        } );

    }



    @Test
    void functionEx2() {

        arraylist.add(new Student("A",10, 8));
        arraylist.add(new Student("B",20, 1));
        arraylist.add(new Student("C",30, 4));
        arraylist.add(new Student("D",40, 5));

        average( t -> {
            return t.getMathScore();
        }, "수학");

        average( t -> {
            return t.getEnglishScore();
        }, "영어");
    }

    public void printString( Function<Student,String> function ) {


        for (Student student : list) {
            String str = function.apply(student);
            System.out.println("이름 : " + str);
        }

    }


    public void printInt( ToIntFunction<Student> function ) {

        for (Student student : list) {
            int score = function.applyAsInt(student);
            System.out.println("점수 : " + score);
        }

    }


    public void average(ToIntFunction<Student> function, String str) {
        int sum = 0;
        double avg = 0.0;

        for (Student student : arraylist) {
            sum += function.applyAsInt(student);
        }

        System.out.println(str + "과목의 점수 평균은 " + sum / arraylist.size());

    }



}
