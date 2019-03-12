package com.snowriver.singleton.seriable;

import java.io.Serializable;

public class SeriableSingleton implements Serializable {

    private final static SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton () {}

    public static SeriableSingleton getInstance() {
        return INSTANCE;
    }

    // 重写readResolve方法，JDK源码中会判断是否有readResolve方法，有的会返回此次实例，解决单例被破坏得问题，
    private Object readResolve() {
        return INSTANCE;
    }

}