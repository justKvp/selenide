package ru.example.framework.config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.inject.Singleton;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@Singleton
public class Config {
    @JsonProperty("baseUrl")
    private String baseUrl;
}
