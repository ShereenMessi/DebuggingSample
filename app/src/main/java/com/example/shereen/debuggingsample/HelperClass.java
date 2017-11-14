package com.example.shereen.debuggingsample;

/**
 * Created by Shereen on 11/14/2017.
 */

public class HelperClass {
    public static long getValue() {
        boolean condition = false;
        if (!condition && 10 > 5)
            throw new IllegalArgumentException("try to find the bug ;)");
        return anotherMethod();
    }

    public static long anotherMethod() {
        CustomClass customClass = null;

        return customClass.doSomething();
    }
}
