package ru.example.framework.testclasses;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static ru.example.framework.constants.BrowserTypes.*;

public class BaseWebTest {

    private Playwright playwright;
    private Browser browser;
    public Page page;

    @BeforeEach
    public void createBrowser() {
        this.playwright = Playwright.create();
        boolean headless = !StringUtils.isEmpty(System.getProperty("headless")) && System.getProperty("headless").equals("true");

        if (StringUtils.isEmpty(System.getProperty("browser"))) {
            this.browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(headless));
        }
        else {
            String browser = System.getProperty("browser");
            switch(browser) {
                case CHROMIUM:
                    this.browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(headless));
                    break;
                case WEBKIT:
                    this.browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(headless));
                    break;
                case FIREFOX:
                    this.browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(headless));
                    break;
            }
        }
        this.page = browser.newPage();
    }

    @AfterEach
    public void closePlaywright() {
        this.browser.close();
        this.playwright.close();
    }
}
