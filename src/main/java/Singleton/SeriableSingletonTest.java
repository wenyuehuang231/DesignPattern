package Singleton;

import Singleton.HungrySingleton.HungrySingletonSerializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * created by Mr.huang on 2019/12/29
 */
public class SeriableSingletonTest {
    public static void main(String[] args) {
        HungrySingletonSerializable s1 = null;
        HungrySingletonSerializable s2 = HungrySingletonSerializable.getInstance();
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2); oos.flush(); oos.close();
            FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (HungrySingletonSerializable)ois.readObject();
            ois.close();
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
