package me.lokvin.kiwi.kiwikit.base;

import org.apache.commons.lang3.BooleanUtils;

public class SystemPropertiesUtil {

    public static Boolean getBoolean(String key) {
        String value = System.getProperty(key);
        return BooleanUtils.toBooleanObject(value);
    }

    public static Boolean getBoolean(String key, Boolean defaultValue) {
        return SystemPropertiesUtil.getBoolean(key) != null ? SystemPropertiesUtil.getBoolean(key) : defaultValue;
    }

    public static String getString(String key) {
        return System.getProperty(key);
    }

    public static String getString(String key, String defaultValue) {
        return System.getProperty(key, defaultValue);
    }

    public static Integer getInteger(String key) {
        return Integer.getInteger(key);
    }

    public static Integer getInteger(String key, Integer defaultValue) {
        return Integer.getInteger(key, defaultValue);
    }

    public static Long getLong(String key) {
        return Long.getLong(key);
    }

    public static Long getLong(String key, Long defaultValue) {
        return Long.getLong(key, defaultValue);
    }

}
