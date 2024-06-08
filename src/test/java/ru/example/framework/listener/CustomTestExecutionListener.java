package ru.example.framework.listener;

import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestPlan;

public class CustomTestExecutionListener implements TestExecutionListener {
    public void testPlanExecutionStarted(TestPlan testPlan) {
        System.out.println("##########testPlanExecutionStarted "+testPlan.getRoots());

//        if (System.getProperty("chromedriver") == null) {
////            Configuration.remote = testconfig.getSeleniumhub().getRemote();
////            Configuration.reportsFolder = testconfig.getSeleniumhub().getReportsFolder();
////            Configuration.timeout = testconfig.getSeleniumhub().getTimeout();
//        } else {
//            System.setProperty("webdriver.chrome.driver", System.getProperty("chromedriver"));
//            System.out.println("DRIVER: " + System.getProperty("webdriver.chrome.driver"));
//        }
    }

    public void testPlanExecutionFinished(TestPlan testPlan) {
        System.out.println("##########testPlanExecutionStarted "+testPlan.getRoots());
    }
}
