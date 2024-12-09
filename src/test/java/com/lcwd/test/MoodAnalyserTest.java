package com.lcwd.test;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void When_Message_Is_Sad_Should_Return_Sad(){

        MoodAnalyser m1=new MoodAnalyser("I am Sad");
        Assert.assertEquals("SAD",m1.AnalyseMood());

    }
    @Test
    public void When_Message_Is_Happy_Should_Return_Happy(){

        MoodAnalyser m1=new MoodAnalyser("I am Happy");
        Assert.assertEquals("HAPPY",m1.AnalyseMood());
    }



}
