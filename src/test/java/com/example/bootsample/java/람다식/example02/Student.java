package com.example.bootsample.java.람다식.example02;

public class Student {

    private String name;
    private int englishScore;
    private int mathScore;

    private String address;

    public Student(String name, int englishScore, int mathScore) {
        this.name = name;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    public Student(String name, int englishScore, int mathScore, String address) {
        this.name = name;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public String getAddress() {
        return address;
    }
}
