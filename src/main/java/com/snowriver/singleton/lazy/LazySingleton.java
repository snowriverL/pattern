package com.snowriver.singleton.lazy;

/**
 * 双重检查锁的单例模式
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton() {}

    public static LazySingleton getLazySingleton() {
        if (null == lazySingleton) {
            synchronized (LazySingleton.class) {
                if (null == lazySingleton) {
                    return new LazySingleton();
                }
            }
        }
        return  lazySingleton;
    }

}