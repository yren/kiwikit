package me.lokvin.kiwi.kiwikit.base;

import org.junit.Test;

public class RuntimeUtilTest {

    @Test
    public void testRuntimeUtil() {

        System.out.println("CPU CORE: " + RuntimeUtil.getCores());
        System.out.println("JVM UPTIME (millisecond): " + RuntimeUtil.getUpTime());
        System.out.println("PID: " + RuntimeUtil.getPid());
        System.out.println("VM Arguments: " + RuntimeUtil.getVmArguments());
        RuntimeUtil.addShutdownHook(() -> {System.out.println("systemShutdowning ...");});
        System.out.println("Caller class: " + RuntimeUtil.getCallerClass());
    }
}
