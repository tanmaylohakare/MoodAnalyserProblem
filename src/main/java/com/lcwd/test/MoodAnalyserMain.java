package com.lcwd.test;

public class MoodAnalyserMain {

    public static <InvalidMoodException extends Throwable> void main(String[] args) {
        System.out.println("Welcome to Mood Analyzer Problem");
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

        try{System.out.println("Mood: " +moodAnalyzer.analyseMood(""));
        } catch (MoodAnalysisException e) {
            System.out.println("Error: " + e.getError() + " - " + e.getMessage());
        }
    }
}
