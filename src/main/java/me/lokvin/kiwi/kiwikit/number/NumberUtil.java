package me.lokvin.kiwi.kiwikit.number;

import me.lokvin.kiwi.kiwikit.base.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

public class NumberUtil {

    public static Double toDoubleObject(@Nullable String val, Double defaultValue) {
        if (StringUtils.isEmpty(val)) {
            return defaultValue;
        }
        try {
            return Double.valueOf(val);
        } catch (NumberFormatException ex) {
            return defaultValue;
        }
    }

    public static Double toDoubleObject(@Nullable String val) {
        return NumberUtil.toDoubleObject(val, null);
    }
}
