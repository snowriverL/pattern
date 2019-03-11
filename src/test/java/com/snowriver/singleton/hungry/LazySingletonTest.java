package com.snowriver.singleton.hungry;

import com.snowriver.singleton.lazy.LazySingleton;
import com.snowriver.singleton.utils.ConcurrentExecutor;
import org.junit.Test;

public class LazySingletonTest {

    @Test
    public void TestLazy() {
        try {
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                public void handler() {
                    LazySingleton lazySingleton = LazySingleton.getLazySingleton();
                    System.out.println(Thread.currentThread().getName() + " : " + lazySingleton);
                }
            }, 10, 50);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}