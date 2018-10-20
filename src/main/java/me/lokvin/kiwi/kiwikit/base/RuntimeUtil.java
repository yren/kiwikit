package me.lokvin.kiwi.kiwikit.base;

import java.lang.management.ManagementFactory;

public class RuntimeUtil {

    public static int getCores() {
        return Runtime.getRuntime().availableProcessors();
    }

    public static long getUpTime() {
        return ManagementFactory.getRuntimeMXBean().getUptime();
    }

    public static int getPid() {
        // pid@hostname
        String jvmName = ManagementFactory.getRuntimeMXBean().getName();
        String[] split = jvmName.split("@");
        if (split.length != 2) {
            return -1;
        }

        try {
            return Integer.parseInt(split[0]);
        } catch (Throwable e) {
            return -1;
        }
    }
}
