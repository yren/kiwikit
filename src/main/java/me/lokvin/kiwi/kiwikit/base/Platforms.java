package me.lokvin.kiwi.kiwikit.base;

import org.apache.commons.lang3.SystemUtils;

import java.io.File;

/**
 * copy from vjkit
 * platform related constant
 */
public final class Platforms {

    public static final String FILE_PATH_SEPARATOR = File.separator;
    public static final char FILE_PATH_SEPARATOR_CHAR = File.separatorChar;
    public static final char WINDOWS_FILE_PATH_SEPARATOR_CHAR = '\\';
    public static final char LINUX_FILE_PATH_SEPARATOR_CHAR = '/';

    public static final String CLASS_PATH_SEPARATOR = File.pathSeparator;
    public static final char CLASS_PATH_SEPARATOR_CHAR = File.pathSeparatorChar;

    public static final String LINE_SEPARATOR = System.lineSeparator();

    public static final String TMP_DIR = SystemUtils.JAVA_IO_TMPDIR;
    public static final String WORKING_DIR = SystemUtils.USER_DIR;
    public static final String USER_HOME = SystemUtils.USER_HOME;
    public static final String JAVA_HOME = SystemUtils.JAVA_HOME;

    public static final String JAVA_SPECIFICATION_VERSION = SystemUtils.JAVA_SPECIFICATION_VERSION; // eg. 1.8
    public static final String JAVA_VERSION = SystemUtils.JAVA_VERSION; // eg. 1.8.181

    public static final String OS_NAME = SystemUtils.OS_NAME;
    public static final String OS_VERSION = SystemUtils.OS_VERSION;
    public static final String OS_ARCH = SystemUtils.OS_ARCH;
    public static final boolean IS_LINUX = SystemUtils.IS_OS_LINUX;
    public static final boolean IS_UNIX = SystemUtils.IS_OS_UNIX;
    public static final boolean IS_MAC = SystemUtils.IS_OS_MAC;
    public static final boolean IS_WINDOWS = SystemUtils.IS_OS_WINDOWS;

}
