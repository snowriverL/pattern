package com.snowriver.singleton.hungry;

import com.snowriver.singleton.register.EnumSingleton;
import com.snowriver.singleton.seriable.SeriableSingleton;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class EnumSingletonTest {

    @Test
    public void TestSeriableSingleton() {

        EnumSingleton s1 = null;
        EnumSingleton s2 = EnumSingleton.getInstance();
        s2.setData(new Object());

        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (EnumSingleton)ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void TestReflectSingleton() {
        Class<?> clazz = EnumSingleton.class;

        try {
            Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, int.class);

            constructor.setAccessible(true);

            Object instance1 = constructor.newInstance();

            Object instance2 = constructor.newInstance();

            EnumSingleton instance3 = EnumSingleton.getInstance();

            System.out.println(instance1 == instance2);
            System.out.println(instance1 == instance3);
            System.out.println(instance2 == instance3);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}