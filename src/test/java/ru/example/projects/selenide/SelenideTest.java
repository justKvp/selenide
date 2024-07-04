package ru.example.projects.selenide;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.example.framework.config.ConfigMgr;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;
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
        $("[placeholder=\"Найдётся всё\"]").shouldBe(Condition.visible, Duration.ofSeconds(5)).click();
        getScreenshot("Страница");
    }

    @Test
    @Tag("selenide3")
    public void selenide3() {
        open("https://www.sberbank.ru/ru/person/persons");
        logToAllure("Открыто в браузере " + ConfigMgr.browserName);
        $x("//*[@class='dk-sbol-button__text dk-sbol-button__text_size_md' and text()='Уже хочу карту!']").shouldBe(Condition.visible, Duration.ofSeconds(5)).click();
        getScreenshot("Страница");
    }
}
