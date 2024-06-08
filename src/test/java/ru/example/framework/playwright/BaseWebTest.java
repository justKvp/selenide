package ru.example.framework.playwright;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.junit.UsePlaywright;
import org.junit.jupiter.api.AfterEach;

import static ru.example.framework.allure.AllureUtil.makeScreenshot;

@UsePlaywright(PWOptions.class)
public class BaseWebTest {

    @AfterEach
    public void afterEach(Page page) {
        makeScreenshot(page,"После теста");
    }
}
