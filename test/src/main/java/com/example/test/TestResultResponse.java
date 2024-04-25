package com.example.test;

public class TestResultResponse {
    private String testResults;

    public TestResultResponse(String testResults) {
        this.testResults = testResults;
    }

    public String getTestResults() {
        return testResults;
    }

    public void setTestResults(String testResults) {
        this.testResults = testResults;
    }
}
