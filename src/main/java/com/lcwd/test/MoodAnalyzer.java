package com.lcwd.test;

public class MoodAnalyzer {

    private String message;

    // Non Parameterize Constructor
    MoodAnalyzer() {

    }


    //Parameterize Constructor
    MoodAnalyzer(String message) {
        this.message = message;
    }


//    // Method 1 (Parameterize constructor is used in this method )
//    public static String AnalyseMood(String message) {
//
//
//
//            if (message == null || message.isEmpty()) {
//                return "Nutral";
//            }
//
//            if (message.toLowerCase().contains("sad")) {
//                return "SAD";
//            }
//
//            if (message.toLowerCase().contains("happy")) {
//                return "HAPPY";
//            }
//
//            return "HAPPY";
//        }
//
//        }

    // Method 2 (Non Paremeterize Constructor is been used )
    public String AnalyseMood1(String inputMessage) {
    try {
        if (message == null || message.isEmpty()) {
            throw new InvalidMoodException("Invalid Mood , please enter valid mood");
        }

        if (message.toLowerCase().contains("sad")) {
            return "SAD";
        }

        if (message.toLowerCase().contains("happy")) {
            return "HAPPY";
        }

        return "HAPPY";
    }
    catch (InvalidMoodException e)
    {
        return "HAPPY";

    }

    }
}



