package Singleton;

import Proxy.Dynamic.Person;
import Singleton.LazySingleton.LazySingletonThree;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @author : Mr.Huang
 * @date : 2019/12/20 10:17
 */
public class MainTest {
    public static void main(String[] args) {
        /*Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("------End------");*/

        /*LazySingletonThree singleton1 = LazySingletonThree.getInstance();
        LazySingletonThree singleton2 = LazySingletonThree.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);*/

        /*try {
            //$Proxy0
            byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
            os.write(bytes);
            os.close();

        }catch (Exception e){
            e.printStackTrace();
        }*/

    }
}
