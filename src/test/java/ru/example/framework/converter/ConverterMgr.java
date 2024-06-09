package ru.example.framework.converter;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.SneakyThrows;
import org.json.JSONObject;

public class ConverterMgr {
    private static ObjectMapper objectMapper;

    public static void initializeConverter() {
        objectMapper = new ObjectMapper();
        objectMapper.setVisibility(objectMapper.getSerializationConfig().getDefaultVisibilityChecker()
                .withFieldVisibility(JsonAutoDetect.Visibility.ANY)
                .withGetterVisibility(JsonAutoDetect.Visibility.NONE)
                .withSetterVisibility(JsonAutoDetect.Visibility.NONE)
                .withCreatorVisibility(JsonAutoDetect.Visibility.NONE));
        objectMapper.findAndRegisterModules();
    }

    /** Возвращает объект нужного класса из текста (json/xml) **/
    @SneakyThrows
    public static <T> T makeObjectFromString(String json, Class<T> className) {
        return objectMapper.readValue(json, className);
    }

    /** Возвращает объект в виде красивого текста (json или xml) **/
    @SneakyThrows
    public static String makeStringFromObject(Object obj) {
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        return objectMapper.writeValueAsString(obj);
    }

    /** Возвращает объект в виде простого текста (без табуляции (json в виде 1 строки)) **/
    @SneakyThrows
    public static String makeSimpleStringFromObject(Object obj) {
        objectMapper.disable(SerializationFeature.INDENT_OUTPUT);
        return objectMapper.writeValueAsString(obj);
    }

    public static JSONObject makeJSONFromString(String stringJson) {
        return new JSONObject(stringJson);
    }
}
