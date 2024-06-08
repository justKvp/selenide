package ru.example.projects.secondproject;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Второй suite")
public class SecondTest {
    @Test
    @DisplayName("1 : Тест первый")
    @Description("Описание")
    void simpleTest() {
    }
}
