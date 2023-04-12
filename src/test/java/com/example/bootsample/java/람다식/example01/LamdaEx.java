package com.example.bootsample.java.람다식.example01;

import org.junit.jupiter.api.Test;

public class LamdaEx {

    @Test
    void test(){

        MyInterface myInterface = new MyInterface() {
            @Override
            public void method() {
                System.out.println("메소드 생성");
            }
        };

        MyInterface myInterface2 = () -> {
            System.out.println("메소드 생성2");
        };


        myInterface2.method();



    }
}
