package me.lokvin.kiwi.kiwikit.reflect;

public class ClassLoaderUtil {

    /**
     * Copy from vjkit
     * Get ClassLoader in order
     * 1. Thread.currentThread().getContextClassLoader();
     * 2. This class ClassLoader
     * 3. SystemClassLoader
     * @return ClassLoader
     */
    public static ClassLoader getDefaultClassLoader() {
        ClassLoader cl = null;
        try {
            cl = Thread.currentThread().getContextClassLoader();
        } catch (Throwable ex) {
            // can't access thread context ClassLoader
        }

        if (cl == null) {
            cl = ClassLoaderUtil.class.getClassLoader();
            if (cl == null) {
                try {
                    cl = ClassLoader.getSystemClassLoader();
                } catch (Throwable ex) {
                    // can't access system ClassLoader
                }
            }
        }
        return cl;
    }

    public static boolean isPresent(String className, ClassLoader classLoader) {
        try {
            classLoader.loadClass(className);
            return true;
        } catch (Throwable ex) {
            return false;
        }
    }
}
