package com.snowriver.singleton.hungry;

import com.snowriver.singleton.lazy.LazyInnerClassSingleton;
import com.snowriver.singleton.utils.ConcurrentExecutor;
import org.junit.Test;

import java.lang.reflect.Constructor;

public class LazyInnerClassSingletonTest {

    @Test
    public void TestLazy() {
        try {
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                public void handler() {
                    LazyInnerClassSingleton lazySingleton = LazyInnerClassSingleton.getInstance();
                    System.out.println(Thread.currentThread().getName() + " : " + lazySingleton);
                }
            }, 50, 50);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void TestReflect() {
        try {
            Class<?> clazz = LazyInnerClassSingleton.class;

            Constructor<?> c = clazz.getDeclaredConstructor(null);

            c.setAccessible(true);

            Object instance1 = c.newInstance();

            //Object instance2 = c.newInstance();

            LazyInnerClassSingleton instance3 = LazyInnerClassSingleton.getInstance();

            //System.out.println(instance1 == instance2);
            System.out.println(instance1 == instance3);
            //System.out.println(instance2 == instance3);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}