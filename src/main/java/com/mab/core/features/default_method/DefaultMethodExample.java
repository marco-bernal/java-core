package com.mab.core.old.features.default_method;

//TODO: Add implementations and unit tests

public interface DefaultMethodExample {

    void normalMethod(String value);


    default void myMethod() {

    }

    default int myMethod2() {
        return 1;
    }


    default String myMethod3() {
        return "";
    }
}
