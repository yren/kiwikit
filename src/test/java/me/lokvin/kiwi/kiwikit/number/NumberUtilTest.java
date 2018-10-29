package me.lokvin.kiwi.kiwikit.number;

import org.junit.Assert;
import org.junit.Test;

public class NumberUtilTest {

    @Test
    public void testToDoubleObject() {
        Assert.assertEquals("should be equal 1.005", Double.valueOf("1.005"), NumberUtil.toDoubleObject("1.005"));
        Assert.assertNull("should be null", NumberUtil.toDoubleObject(null));
    }
}
