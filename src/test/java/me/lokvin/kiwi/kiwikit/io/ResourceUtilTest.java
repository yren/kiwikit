package me.lokvin.kiwi.kiwikit.io;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class ResourceUtilTest {

    @Test
    public void testAsString() throws IOException {
        Assert.assertTrue(ResourceUtil.asString("test.txt").contains("Hello"));
    }
}
