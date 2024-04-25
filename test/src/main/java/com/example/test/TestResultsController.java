package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestResultsController {

    @Autowired
    private ResidentServiceTest residentServiceTest;

    @PostMapping("result")
    @ResponseBody
    public TestResultResponse showTestResults(@RequestBody UseCaseRequest request) {
        try {

            String testResults = residentServiceTest.runTests(request.getUseCase());
            return new TestResultResponse(testResults);
        } catch (Exception e) {
            e.printStackTrace();
            return new TestResultResponse("Error occurred while running tests: " + e.getMessage());
        }
    }
}