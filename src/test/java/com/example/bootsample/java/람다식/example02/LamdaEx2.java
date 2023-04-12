package com.example.bootsample.java.람다식.example02;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

public class LamdaEx2 {

    @Test
    void test(){

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 10; i++) {
                    System.out.print(i);
                }
            };
        };

        Thread thread = new Thread(runnable);
        thread.start();


        Thread thread2 = new Thread(() -> {
            for (int i = 0; i <= 10; i++) {
                System.out.print(i);
            }
        });

        thread2.start();

        System.out.println("=============================================");

        Consumer<Integer> cun = (x) -> System.out.println(x + 50);
        cun.accept(40);


    }
}
