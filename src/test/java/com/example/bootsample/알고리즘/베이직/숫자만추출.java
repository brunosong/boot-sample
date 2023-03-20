package com.example.bootsample.알고리즘.베이직;

import org.junit.jupiter.api.Test;

public class 숫자만추출 {

    @Test
    void test(){

        String str = "g0en2T0s8eSoft";

        System.out.println(str.chars().filter(Character::isDigit).count());

    }
}
