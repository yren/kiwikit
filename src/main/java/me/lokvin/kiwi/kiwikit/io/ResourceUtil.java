package me.lokvin.kiwi.kiwikit.io;

import com.google.common.io.Resources;
import me.lokvin.kiwi.kiwikit.reflect.ClassLoaderUtil;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class ResourceUtil {

    public static URL asUrl(String resourceName) {
        return Resources.getResource(resourceName);
    }

    public static URL asUrl(Class<?> contextClass, String resourceName) {
        return Resources.getResource(contextClass, resourceName);
    }

    public static InputStream asStream(String resourceName) throws IOException {
        return ResourceUtil.asUrl(resourceName).openStream();
    }

    public static InputStream asStream(Class<?> contextClass, String resourceName) throws IOException {
        return ResourceUtil.asUrl(contextClass, resourceName).openStream();
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

    public static List<URL> getResourcesQuietly(String resourceName) {
        return getResourcesQuietly(resourceName, ClassLoaderUtil.getDefaultClassLoader());
    }

    private static List<URL> getResourcesQuietly(String resourceName, ClassLoader classLoader) {
        try {
            Enumeration<URL> urls = classLoader.getResources(resourceName);
            List<URL> list = new ArrayList<URL>(10);
            while (urls.hasMoreElements()) {
                list.add(urls.nextElement());
            }
            return list;
        } catch (IOException e) {
            return Collections.emptyList();
        }

    }


}
