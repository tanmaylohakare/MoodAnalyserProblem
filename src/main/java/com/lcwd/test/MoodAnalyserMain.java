package com.lcwd.test;

public class MoodAnalyserMain {

    public static void main(String[] args) {
        System.out.println("WelCome to Mood Analyser Problem ");

        MoodAnalyzer m1=new MoodAnalyzer();
//        String mood1 = m1.AnalyseMood("I am in happy mood");
        String mood2 =m1.AnalyseMood("I am in happy mood");


//        System.out.println("I am :"+ mood1);
        System.out.println("I am "+ mood2);


    }
}
