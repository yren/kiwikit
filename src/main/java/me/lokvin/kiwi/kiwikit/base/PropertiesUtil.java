package me.lokvin.kiwi.kiwikit.base;

import me.lokvin.kiwi.kiwikit.io.ResourceUtil;
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
