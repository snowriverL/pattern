package com.snowriver.singleton.hungry;

/**
 * 绝对线程安全，在线程还没出现以前就是实例化了，不可能存在访问安全问题
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    /**
     *     静态代码块
     *     private static final HungrySingleton hungrySingleton;
     *     static {
     *         hungrySingleton = new HungrySingleton();
     *     }
     */


    private HungrySingleton () {}

    public HungrySingleton getInstance() {
        return hungrySingleton;
    }

}