package me.lokvin.kiwi.kiwikit.base;

import org.junit.Assert;
import org.junit.Test;

public class SystemPropertiesUtilTest {

    @Test
    public void testSystemPropertiesUtil() {
        String key = "kiwikit.test";

        Assert.assertNull(SystemPropertiesUtil.getBoolean(key));
        Assert.assertFalse(SystemPropertiesUtil.getBoolean(key, false));
        Assert.assertTrue(SystemPropertiesUtil.getBoolean(key, true));

        System.setProperty(key, "true");
        Assert.assertTrue(SystemPropertiesUtil.getBoolean(key));
        Assert.assertTrue(SystemPropertiesUtil.getBoolean(key, false));

    }
}
