package ru.example.framework.utils;

import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;

import static io.restassured.config.DecoderConfig.decoderConfig;
import static io.restassured.config.EncoderConfig.encoderConfig;

public class RAUtil {
    public static final RestAssuredConfig configJSON = RestAssuredConfig
            .config()
            .sslConfig(SSLConfig.sslConfig().allowAllHostnames().relaxedHTTPSValidation())
            .encoderConfig(
                    encoderConfig()
                            .defaultContentCharset("UTF-8")
                            .defaultCharsetForContentType("UTF-8", "application/json"))
            .decoderConfig(decoderConfig()
                    .defaultContentCharset("UTF-8")
                    .defaultCharsetForContentType("UTF-8", "application/json"));
    public static final RestAssuredConfig configXML = RestAssuredConfig
            .config()
            .sslConfig(SSLConfig.sslConfig().allowAllHostnames().relaxedHTTPSValidation())
            .encoderConfig(
                    encoderConfig()
                            .defaultContentCharset("UTF-8")
                            .defaultCharsetForContentType("UTF-8", "application/xml"))
            .decoderConfig(decoderConfig()
                    .defaultContentCharset("UTF-8")
                    .defaultCharsetForContentType("UTF-8", "application/xml"));
}
