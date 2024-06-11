package ru.example.framework.listener;

import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestPlan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.example.framework.config.ConfigMgr;
import ru.example.framework.converter.ConverterMgr;

public class CustomTestExecutionListener implements TestExecutionListener {
    private static final Logger logger = LoggerFactory.getLogger(CustomTestExecutionListener.class);

    public void testPlanExecutionStarted(TestPlan testPlan) {
        logger.info("testPlanExecutionStarted : " + testPlan.getRoots());
        ConfigMgr.initializeConfig();
        ConverterMgr.initializeConverter();
    }

    public void testPlanExecutionFinished(TestPlan testPlan) {
        logger.info("testPlanExecutionStarted : " + testPlan.getRoots());
    }
}
