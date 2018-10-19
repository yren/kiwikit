package me.lokvin.kiwi.kiwikit.base;

import org.apache.commons.lang3.SystemUtils;
import org.junit.Test;

public class PlatformsTest {

    @Test
    public void testPlatforms() {
        System.out.println("OS_NAME: " + Platforms.OS_NAME);
        System.out.println("OS_VERSION: " + Platforms.OS_VERSION);
        System.out.println("OS_ARCH: " + Platforms.OS_ARCH);
    }
}
