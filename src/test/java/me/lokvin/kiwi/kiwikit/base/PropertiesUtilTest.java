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
}
