package me.lokvin.kiwi.kiwikit.base;

import me.lokvin.kiwi.kiwikit.base.type.Pair;
import org.junit.Assert;
import org.junit.Test;

public class PairTest {

    @Test
    public void pairTest() {
        Pair<String, Integer> pair1 = Pair.of("mary", 24);
        Pair<String, Integer> pair2 = Pair.of("mary", 30);
        Assert.assertNotEquals(pair1, pair2);
    }
}