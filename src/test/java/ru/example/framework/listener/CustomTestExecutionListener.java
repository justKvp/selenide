package ru.example.framework.listener;

import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestPlan;
import ru.example.framework.config.ConfigMgr;
import ru.example.framework.converter.ConverterMgr;

public class CustomTestExecutionListener implements TestExecutionListener {
    public void testPlanExecutionStarted(TestPlan testPlan) {
        System.out.println("testPlanExecutionStarted " + testPlan.getRoots());
        ConfigMgr.initializeConfig();
        ConverterMgr.initializeConverter();
    }

    public void testPlanExecutionFinished(TestPlan testPlan) {
        System.out.println("testPlanExecutionStarted " + testPlan.getRoots());
    }
}
