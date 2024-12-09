package com.lcwd.test;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void When_Message_Is_Sad_Should_Return_Sad(){

        MoodAnalyser m1=new MoodAnalyser();
        Assert.assertEquals("SAD",m1.AnalyseMood("I am Sad"));

    }


}
