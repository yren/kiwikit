package me.lokvin.kiwi.kiwikit.base;

import me.lokvin.kiwi.kiwikit.base.type.Triple;
import org.junit.Assert;
import org.junit.Test;

public class TripleTest {

    @Test
    public void tripleTest() {
        Triple<String, String, Integer> t1 = Triple.of("mary", "female", 20);
        Triple<String, String, Integer> t2 = Triple.of("tom", "male", 23);

        Assert.assertNotEquals(t1, t2);
    }
}
