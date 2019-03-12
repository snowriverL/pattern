package com.snowriver.singleton.threadlocal;

import com.snowriver.singleton.utils.ConcurrentExecutor;
import com.snowriver.singleton.utils.ExectorThread;

public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> threadLocal  = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton() {}

    public static ThreadLocalSingleton getInstance() {
        return threadLocal.get();
    }

    public static void main(String[] args) throws Exception {

        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");

        ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
            public void handler() {
                ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();

                System.out.println(Thread.currentThread().getName() + " : " + instance);
            }
        }, 20, 20);
    }

}