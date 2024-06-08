package ru.example.framework.allure;

import com.microsoft.playwright.Page;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;

public class AllureUtil {
    /**
     * Аннотацию @Step используется для регистрации данного сообщения журнала в Allure.
     *
     * @param message сообщение для входа в отчет allure
     */
    @Step("{0}")
    public static void logToAllure(String message) {}

    @Attachment(value = "Screenshot: {str}", type = "image/png")
    public static byte[] makeScreenshot(Page page, String str) {
        return page.screenshot();
    }
}
