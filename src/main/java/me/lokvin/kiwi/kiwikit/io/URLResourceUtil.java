package me.lokvin.kiwi.kiwikit.io;

import com.google.common.io.Resources;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class URLResourceUtil {

    public static URL asUrl(String resourceName) {
        return Resources.getResource(resourceName);
    }

    public static URL asUrl(Class<?> contextClass, String resourceName) {
        return Resources.getResource(contextClass, resourceName);
    }

    public static InputStream asStream(String resourceName) throws IOException {
        return URLResourceUtil.asUrl(resourceName).openStream();
    }

    public static InputStream asStream(Class<?> contextClass, String resourceName) throws IOException {
        return URLResourceUtil.asUrl(contextClass, resourceName).openStream();
    }

    public static String toString(String resourceName) throws IOException {
        return Resources.toString(Resources.getResource(resourceName), StandardCharsets.UTF_8);
    }

    public static String toString(Class<?> contextClass, String resourceName) throws IOException {
        return Resources.toString(Resources.getResource(contextClass, resourceName), StandardCharsets.UTF_8);
    }

    public static List<String> toLines(String resourceName) throws IOException {
        return Resources.readLines(Resources.getResource(resourceName), StandardCharsets.UTF_8);
    }

    public static List<String> toLines(Class<?> contextClass, String resourceName) throws IOException {
        return Resources.readLines(Resources.getResource(contextClass, resourceName), StandardCharsets.UTF_8);
    }


}
