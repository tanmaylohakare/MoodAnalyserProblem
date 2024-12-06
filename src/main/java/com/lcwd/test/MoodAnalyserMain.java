package com.lcwd.test;

public class MoodAnalyserMain {

    public static void main(String[] args) {
        System.out.println("WelCome to Mood Analyser Problem ");

        MoodAnalyser m1=new MoodAnalyser();
        String mood = m1.AnalyseMood("Happy");


        System.out.println("I am :"+ mood);

    }
}
