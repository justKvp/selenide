package ru.example.framework.playwright;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class TestResultExtension implements AfterTestExecutionCallback {
    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
        boolean testFailed = extensionContext.getExecutionException().isPresent();
        if (testFailed) {
            BaseWebTest baseWebTest = (BaseWebTest) extensionContext.getTestInstance().get();
            baseWebTest.screenshotAfterFail();
        }
    }
}
