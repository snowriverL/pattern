package com.snowriver.singleton.seriable;

import java.io.Serializable;

public class SeriableSingleton implements Serializable {

    private final static SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton () {}

    public static SeriableSingleton getInstance() {
        return INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }

}