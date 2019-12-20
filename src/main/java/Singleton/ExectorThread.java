package Singleton;

import Singleton.LazySingleton.LazySingletonTwo;

/**
 * @author : Mr.Huang
 * @date : 2019/12/20 16:18
 */
public class ExectorThread implements Runnable {

    @Override
    public void run() {
        //HungrySingleton singleton = HungrySingleton.getInstance();
        //LazySingletonOne singleton = LazySingletonOne.getInstance();
        LazySingletonTwo singleton = LazySingletonTwo.getInstance();

        System.out.println(Thread.currentThread().getName()+":"+singleton);
    }

}
