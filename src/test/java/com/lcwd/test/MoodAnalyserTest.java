package com.lcwd.test;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    public void whenMessageIsSad_ShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String result = moodAnalyzer.AnalyseMood1("I am Sad");
        Assert.assertEquals("SAD", result);
    }


    @Test
    public void whenMessageIsHappy_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String result = moodAnalyzer.AnalyseMood1("I am Happy");
        Assert.assertEquals("HAPPY", result);
    }

    @Test
    public void givenNullMessage_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String result = moodAnalyzer.AnalyseMood1(null);
        Assert.assertEquals("HAPPY", result);
    }
}