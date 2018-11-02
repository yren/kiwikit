package me.lokvin.kiwi.kiwikit.base;

import me.lokvin.kiwi.kiwikit.number.NumberUtil;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;

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

    public static Double getDouble(String key) {
        return NumberUtil.toDoubleObject(System.getProperty(key), null);
    }

    public static Double getDouble(String key, Double defaultValue) {
        return NumberUtil.toDoubleObject(System.getProperty(key), defaultValue);
    }

    /**
     * combine system property and envName (-D),
     * prior return propertyKey value if not null, then env value, otherwise defaultValue
     *
     * @param propertyKey
     * @param envName
     * @param defaultValue
     * @return
     */
    public static String getString(String propertyKey, String envName, String defaultValue) {
        checkEnvName(envName);
        String value = SystemPropertiesUtil.getString(propertyKey);
        if (value != null) {
            return value;
        } else {
            value = System.getenv(envName);
            return value != null ? value : defaultValue;
        }
    }

    public static Integer getIneger(String propertyKey, String envName, Integer defaultValue) {
        checkEnvName(envName);
        Integer value = SystemPropertiesUtil.getInteger(propertyKey);
        if (value != null) {
            return value;
        } else {
            value = NumberUtil.toIntObject(System.getenv(envName));
            return value != null ? value : defaultValue;
        }
    }

    /*
     * envName can't include '.' in linux
     */
    private static void checkEnvName(String envName) {
        if (StringUtils.isEmpty(envName) || envName.indexOf('.') != -1) {
            throw new IllegalArgumentException("envName: " + envName + " is not valid");
        }
    }
}
