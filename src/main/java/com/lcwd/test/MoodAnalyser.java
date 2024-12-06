package com.lcwd.test;

public class MoodAnalyser {

    public String AnalyseMood(String message)
    {
        if(message==null || message.isEmpty())
        {
            return "Nutral";
        }

        if (message.toLowerCase().contains("sad"))
        {
            return "SAD";
        }

        if(message.toLowerCase().contains("happy"))
        {
            return "HAPPY";
        }

        return "Nutral";

    }
}
