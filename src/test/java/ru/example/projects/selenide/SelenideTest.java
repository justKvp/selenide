package ru.example.projects.selenide;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.example.framework.config.ConfigMgr;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static ru.example.framework.allure.AllureUtil.getScreenshot;
import static ru.example.framework.allure.AllureUtil.logToAllure;

public class SelenideTest {

    @Test
    @Tag("selenide")
    public void selenide() {
        open("https://ya.ru");
        logToAllure("Открыто в браузере " + ConfigMgr.browserName);
    }

    @Test
    @Tag("selenide2")
    public void selenide2() {
        open("https://ya.ru");
        logToAllure("Открыто в браузере " + ConfigMgr.browserName);
        getScreenshot("Страница");
        $("[placeholder=\"Найдётся всё\"]").shouldBe(Condition.visible, Duration.ofSeconds(5)).click();
    }
}
