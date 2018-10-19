package me.lokvin.kiwi.kiwikit.base;

import org.junit.Test;

public class PlatformsTest {

    @Test
    public void testPlatforms() {
        System.out.println("OS_NAME: " + Platforms.OS_NAME);
        System.out.println("OS_VERSION: " + Platforms.OS_VERSION);
        System.out.println("OS_ARCH: " + Platforms.OS_ARCH);
        System.out.println("JAVA_SPECIFICATION_VERSION: " + Platforms.JAVA_SPECIFICATION_VERSION);
        System.out.println("JAVA_VERSION: " + Platforms.JAVA_VERSION);
        System.out.println("JAVA_HOME: " + Platforms.JAVA_HOME);
        System.out.println("USER_HOME: " + Platforms.USER_HOME);
        System.out.println("TMP_DIR: " + Platforms.TMP_DIR);
        System.out.println("WORKING_DIR: " + Platforms.WORKING_DIR);
    }
}
