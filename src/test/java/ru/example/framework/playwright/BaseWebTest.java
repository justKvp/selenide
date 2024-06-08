package ru.example.framework.playwright;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.junit.UsePlaywright;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;

import static ru.example.framework.allure.AllureUtil.makeScreenshot;

@UsePlaywright(PWOptions.class)
@ExtendWith(TestResultExtension.class)
public class BaseWebTest {
    private Page ptrPage;

    @BeforeEach
    public void beforeEach(Page page) {
        this.ptrPage = page;
    }

    public void screenshotAfterFail() {
        makeScreenshot(ptrPage, "После теста");
    }
}
