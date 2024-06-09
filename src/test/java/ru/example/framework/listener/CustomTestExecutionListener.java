package ru.example.framework.listener;

import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestPlan;
import ru.example.framework.config.ConfigMgr;

public class CustomTestExecutionListener implements TestExecutionListener {
    public void testPlanExecutionStarted(TestPlan testPlan) {
        System.out.println("testPlanExecutionStarted " + testPlan.getRoots());
        ConfigMgr.initializeConfig();
    }

    public void testPlanExecutionFinished(TestPlan testPlan) {
        System.out.println("testPlanExecutionStarted " + testPlan.getRoots());
    }
}
