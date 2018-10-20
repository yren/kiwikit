package me.lokvin.kiwi.kiwikit.base;

import me.lokvin.kiwi.kiwikit.io.ResourceUtil;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class PropertiesUtil {
    private static Logger logger = LoggerFactory.getLogger(PropertiesUtil.class);

    public static boolean getBoolean(Properties p, String name, boolean defaultValue) {
        return BooleanUtils.toBooleanDefaultIfNull(
                BooleanUtils.toBooleanObject(p.getProperty(name)), defaultValue);
    }

    public static int getInt(Properties p, String name, int defaultValue) {
        return NumberUtils.toInt(p.getProperty(name), defaultValue);
    }

    public static long getLong(Properties p, String name, long defaultValue) {
        return NumberUtils.toLong(p.getProperty(name), defaultValue);
    }

    public static double getDouble(Properties p, String name, double defaultValue) {
        return NumberUtils.toDouble(p.getProperty(name), defaultValue);
    }

    public static String getString(Properties p, String name, String defaultValue) {
        return p.getProperty(name, defaultValue);
    }

    public static Properties loadFromFile(String path) {
        Properties p = new Properties();
        try (Reader reader = new InputStreamReader(ResourceUtil.asStream(path), StandardCharsets.UTF_8)) {
            p.load(reader);
        } catch (IOException e) {
            logger.warn("Load property from " + path + " failed", e);
        }
        return p;
    }

    public static Properties loadFromString(String content) {
        Properties p = new Properties();
        try (Reader reader = new StringReader(content)) {
            p.load(reader);
        } catch (IOException e) {
        }
        return p;
    }
}
