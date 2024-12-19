package com.lcwd.test;

public class MoodAnalysisException extends Exception {
    private MoodAnalysisError error;
    public MoodAnalysisException(MoodAnalysisError error, String message) {
        super(message);
        this.error = error;
    }
    public MoodAnalysisError getError() {
        return error;
    }
}
