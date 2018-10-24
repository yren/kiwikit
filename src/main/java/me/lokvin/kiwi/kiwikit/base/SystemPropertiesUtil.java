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

}
