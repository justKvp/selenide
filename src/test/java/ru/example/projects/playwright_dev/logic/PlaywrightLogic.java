package ru.example.projects.playwright_dev.logic;

import com.microsoft.playwright.Page;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import static ru.example.framework.constants.PlaywrightConstants.DEFAULT_VISIBLE_5S;

public class PlaywrightLogic {
    private final Page page;

    public PlaywrightLogic(Page page) {
        this.page = page;
    }

    @Step("Переход на страницу {addr}")
    public void openPage(String addr) {
        page.navigate(addr);
    }

    @Step("Клик на кнопку GET STARTED")
    public void clickButtonGetStarted() {
        page.waitForSelector("//a[@class='getStarted_Sjon']", DEFAULT_VISIBLE_5S);
        page.locator("//a[@class='getStarted_Sjon']").click();
    }

    @Step("Проверка перехода на страницу Getting Started")
    public void checkNextPage() {
        page.waitForSelector("[class=\"hash-link\"]", DEFAULT_VISIBLE_5S);
        Assertions.assertTrue(page.getByLabel("Direct link to Introduction").isVisible());
    }
}
