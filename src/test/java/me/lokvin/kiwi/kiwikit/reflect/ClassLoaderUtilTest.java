package me.lokvin.kiwi.kiwikit.reflect;

import org.junit.Assert;
import org.junit.Test;

public class ClassLoaderUtilTest {
    @Test
    public void testClassLoaderUtil() {
        ClassLoader loader = ClassLoaderUtil.getDefaultClassLoader();
        Assert.assertTrue(ClassLoaderUtil.isPresent("me.lokvin.kiwi.kiwikit.reflect.ClassLoaderUtil", loader));
    }

}
