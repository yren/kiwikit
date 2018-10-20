package me.lokvin.kiwi.kiwikit.base;

import org.junit.Assert;
import org.junit.Test;

import java.util.Properties;

public class PropertiesUtilTest {

    @Test
    public void testLoadFromFile() {
        Properties p = PropertiesUtil.loadFromFile("folder/test.properties");
        Assert.assertEquals("name should be Mimu", "Mimu", p.get("name"));
        Assert.assertEquals("age should be 20", "20", p.get("age"));
    }

    @Test
    public void testLoadFromString() {
        String content = "max: 100\n"
                + "min: 1";
        Properties p = PropertiesUtil.loadFromString(content);
        Assert.assertEquals("100", p.getProperty("max"));
        Assert.assertEquals("1", p.getProperty("min"));
    }
}
