package com.twc.javaBasic.util;

public class CallingAnotherCtor {
    private final String name;

    public CallingAnotherCtor() {
        this("Untitled");
    }

    public CallingAnotherCtor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
