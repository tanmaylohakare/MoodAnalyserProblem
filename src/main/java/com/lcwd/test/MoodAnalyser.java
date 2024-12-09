package com.lcwd.test;

public class MoodAnalyser {

    private String message;

    MoodAnalyser()
    {

    }

MoodAnalyser(String message)
{
    this.message=message;
}
public String AnalyseMood()
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

        return "Happy";

    }
}
