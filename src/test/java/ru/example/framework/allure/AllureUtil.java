package ru.example.framework.allure;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;

import java.util.Base64;

public class AllureUtil {
    /**
     * Аннотацию @Step используется для регистрации данного сообщения журнала в Allure.
     *
     * @param message сообщение для входа в отчет allure
     */
    @Step("{0}")
    public static void logToAllure(String message) {}

//    @Attachment(value = "Screenshot: {str}", type = "image/png")
//    public static byte[] makeScreenshot(Page page, String str) {
//        return page.screenshot();
//    }

    @Attachment(value = "Screenshot {str}", type = "image/png")
    public static byte[] getScreenshot(String str) {
        String screenshotAsBase64 = Selenide.screenshot(OutputType.BASE64);
        byte[] decoded = Base64.getDecoder().decode(screenshotAsBase64);
        return decoded;
    }
}
