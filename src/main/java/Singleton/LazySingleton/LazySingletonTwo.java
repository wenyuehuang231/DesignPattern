package Singleton.LazySingleton;

/**
 * @author : Mr.Huang
 * @date : 2019/12/20 16:10
 */
public class LazySingletonTwo {
    private static LazySingletonTwo lazySingletonOne = null;
    private LazySingletonTwo(){}
    public static LazySingletonTwo getInstance() {
        if (null == lazySingletonOne) {
            synchronized (LazySingletonTwo.class) {
                if (null != lazySingletonOne) {
                    lazySingletonOne = new LazySingletonTwo();
                }
            }
        }
        return lazySingletonOne;
    }
}
