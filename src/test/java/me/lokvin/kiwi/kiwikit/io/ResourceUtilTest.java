package me.lokvin.kiwi.kiwikit.io;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class ResourceUtilTest {

    @Test
    public void testAsString() throws IOException {
        Assert.assertTrue(ResourceUtil.asString("test.txt").contains("Hello"));
    }

    @Test
    public void testAsString2() throws IOException {
        String a = ResourceUtil.asString(ResourceUtilTest.class, "/folder/test.properties");
        Assert.assertTrue(a.contains("name"));

    }
}
