package com.lcwd.test;

public class MoodAnalyserMain {

    public static void main(String[] args) {
        System.out.println("WelCome to Mood Analyser Problem ");

        MoodAnalyser m1=new MoodAnalyser();
//        String mood1 = m1.AnalyseMood("I am in happy mood");
        String mood2 =m1.AnalyseMood("I am in Sad mood");


//        System.out.println("I am :"+ mood1);
        System.out.println("I am "+ mood2);


    }
}
