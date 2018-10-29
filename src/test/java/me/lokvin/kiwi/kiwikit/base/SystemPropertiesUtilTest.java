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

        Assert.assertEquals("true", SystemPropertiesUtil.getString(key));
        Assert.assertEquals("hello", SystemPropertiesUtil.getString("key", "hello"));

        System.setProperty(key, "10");
        Assert.assertEquals(Integer.valueOf(10), SystemPropertiesUtil.getInteger(key));
        Assert.assertEquals("should equals 10", Integer.valueOf(10), SystemPropertiesUtil.getInteger("key", 10));

        Assert.assertEquals("should be equals 10", Long.valueOf(10), SystemPropertiesUtil.getLong(key));
        Assert.assertEquals("should be equals 10", Long.valueOf(10), SystemPropertiesUtil.getLong("key", Long.valueOf(10)));
    }
}
