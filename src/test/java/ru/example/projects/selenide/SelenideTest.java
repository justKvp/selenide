package ru.example.projects.selenide;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class SelenideTest {

    @Test
    @Tag("selenide")
    public void selenide() {
        open("https://ya.ru");
    }
}
