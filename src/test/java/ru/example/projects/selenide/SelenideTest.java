package ru.example.projects.selenide;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static ru.example.framework.allure.AllureUtil.getScreenshot;

public class SelenideTest {

    @Test
    @Tag("selenide")
    public void selenide() {
        open("https://ya.ru");
    }

    @Test
    @Tag("selenide2")
    public void selenide2() {
        open("https://ya.ru");
        getScreenshot("Страница");
        $("[placeholder=\"Найдётся всё\"]").shouldBe(Condition.visible, Duration.ofSeconds(5)).click();

    }
}
