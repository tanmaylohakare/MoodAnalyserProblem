package com.lcwd.test;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void When_Message_Is_Sad_Should_Return_Sad(){

        MoodAnalyzer m1=new MoodAnalyzer();
        Assert.assertEquals("SAD",m1.AnalyseMood("I am Sad"));

    }
    @Test
    public void When_Message_Is_Happy_Should_Return_Happy(){

        MoodAnalyzer m1=new MoodAnalyzer();
        Assert.assertEquals("HAPPY",m1.AnalyseMood("I am Happy"));
    }

    @Test
    public void givenMsgInParameter_whenSad_ShouldReturn_Sad(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        Assert.assertEquals("SAD",moodAnalyzer.AnalyseMood("I am in Sad Mood"));
    }
    @Test
    public void givenMsgInParameter_whenNotSad_ShouldReturn_Happy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any Mood");
        Assert.assertEquals("HAPPY", moodAnalyzer.AnalyseMood("I am in any Mood"));
    }
    @Test
    public void givenMsgNotInParameter_whenSad_ShouldReturn_Sad(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        Assert.assertEquals("SAD",moodAnalyzer.AnalyseMood1());
    }
    @Test
    public void givenMsgNotInParameter_whenNotSad_ShouldReturn_Happy(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any Mood");
        Assert.assertEquals("HAPPY",moodAnalyzer.AnalyseMood1());
    }

}
