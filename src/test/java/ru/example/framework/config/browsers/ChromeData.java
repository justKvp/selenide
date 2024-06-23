package ru.example.framework.config.browsers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.inject.Singleton;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@Singleton
public class ChromeData {
    @JsonProperty("browserBinary")
    private String browserBinary = "/usr/bin/chromium-browser";
    @JsonProperty("driverBinary")
    private String driverBinary = "/usr/bin/chromedriver";
}
