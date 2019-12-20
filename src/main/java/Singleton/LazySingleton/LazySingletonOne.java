package Singleton.LazySingleton;

/**
 * @author : Mr.Huang
 * @date : 2019/12/20 16:10
 */
public class LazySingletonOne {
    private static LazySingletonOne lazySingletonOne = null;
    private LazySingletonOne(){}
    public static LazySingletonOne getInstance() {
        if (null == lazySingletonOne) {
            //这种情况下是线程不安全的，当进入这个判断的时候
            //另一个线程也刚好进入，那么久会出现俩个对象
            lazySingletonOne = new LazySingletonOne();
        }
        return lazySingletonOne;
    }
}
