package ru.example.framework.config;

import com.codeborne.selenide.Configuration;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import lombok.Getter;
import lombok.SneakyThrows;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.Objects;

public class ConfigMgr {
    @Getter
    public static Config config;

    @Getter
    public static String configName;

    @SneakyThrows
    public static void initializeConfig() {
        /**
         * Проверяем на наличие проперти при запуске : -Dconfig , при наличии используем,
         * в остальных случаях дефолтный конфиг - default.yaml
         */
        configName = "default";
        if (!StringUtils.isEmpty(System.getProperty("config"))) {
            configName = System.getProperty("config");
        }

        /**
         * Затягиваем данные из нужного конфига и формируем из них объект класса Config
         */
        String path = String.format("yaml/%s.yaml", configName);
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        File file = new File(Objects.requireNonNull(classLoader.getResource(path)).getFile());
        ObjectMapper om = new ObjectMapper(new YAMLFactory());
        config = om.readValue(file, Config.class);

        //System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        //Configuration.browserBinary = "/usr/bin/chromium-browser";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        //Configuration.headless = true;


        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--locale=ru-RU");
        desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, options);

        Configuration.browserCapabilities = desiredCapabilities;
    }
}
