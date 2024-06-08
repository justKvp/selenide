package ru.example.framework.playwright;

import com.microsoft.playwright.junit.Options;
import com.microsoft.playwright.junit.OptionsFactory;
import org.apache.commons.lang3.StringUtils;

public class PWOptions implements OptionsFactory {
    @Override
    public Options getOptions() {
        Options options = new Options();

        // headless mode
        boolean headless = StringUtils.isEmpty(System.getProperty("headless")) || Boolean.parseBoolean(System.getProperty("headless"));
        options.setHeadless(headless);

        if (!StringUtils.isEmpty(System.getProperty("browser"))) {
            options.setBrowserName(System.getProperty("browser"));
        }

        return options;
    }
}
