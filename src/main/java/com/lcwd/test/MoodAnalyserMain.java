package com.lcwd.test;

public class MoodAnalyserMain {

    public static void main(String[] args) {
        System.out.println("WelCome to Mood Analyser Problem ");

        MoodAnalyzer m1=new MoodAnalyzer();
//        String mood1 = m1.AnalyseMood("I am in happy mood");

        try{
            m1.AnalyseMood1(null);

        }
        catch (InvalidMoodException e)
        {
            System.out.println(e.getMessage());

        }
    }
}
