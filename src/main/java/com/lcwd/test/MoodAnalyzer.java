package com.lcwd.test;

public class MoodAnalyzer {

    private String message;

    MoodAnalyzer()
    {

    }

MoodAnalyzer(String message)
{
    this.message=message;
}

// Method 1
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

        return "HAPPY";

    }

// Method 2
    public String AnalyseMood1()
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

        return "HAPPY";

    }

}
