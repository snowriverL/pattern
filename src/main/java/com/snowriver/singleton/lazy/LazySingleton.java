package com.snowriver.singleton.lazy;

public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton() {}

    public static LazySingleton getLazySingleton() {
        if (null == lazySingleton) {
            lazySingleton = new LazySingleton();
        }
        return  lazySingleton;
    }

}