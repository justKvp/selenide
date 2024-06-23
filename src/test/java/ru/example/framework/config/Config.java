package ru.example.framework.config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import ru.example.framework.config.browsers.ChromeData;
import ru.example.framework.config.browsers.YandexData;

import javax.inject.Singleton;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@Singleton
public class Config {
    @JsonProperty("baseUrl")
    private String baseUrl;
    @JsonProperty("browserChrome")
    private ChromeData browserChrome;
    @JsonProperty("browserYandex")
    private YandexData browserYandex;
}
