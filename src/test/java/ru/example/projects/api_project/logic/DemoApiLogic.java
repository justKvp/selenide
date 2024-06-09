package ru.example.projects.api_project.logic;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import ru.example.framework.config.Config;
import ru.example.framework.config.ConfigMgr;

import static ru.example.framework.allure.AllureUtil.logToAllure;

public class DemoApiLogic {

    @Step("Проверка загруженного конфиг-файла")
    public void checkConfigFile() {
        Config config = ConfigMgr.getConfig();
        Assertions.assertNotNull(config, "Конфиг не был загружен, убедитесь в верном названии конфига");

        logToAllure("ConfigName: " + ConfigMgr.getConfigName());

        Assertions.assertNotNull(config.getBaseUrl(), "config.getBaseUrl() was not founded");
        logToAllure("BaseUrl: " + config.getBaseUrl());
    }
}
