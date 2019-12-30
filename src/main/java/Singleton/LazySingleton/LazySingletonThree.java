package Singleton.LazySingleton;

/**
 * @author : Mr.Huang
 * @date : 2019/12/20 16:10
 */
public class LazySingletonThree {
    private static LazySingletonThree lazySingletonOne = null;

    private LazySingletonThree(){

    }

    public static LazySingletonThree getInstance() {
        return LazyHolder.LAZY;
    }

    private static class LazyHolder{
        private static final LazySingletonThree LAZY = new LazySingletonThree();
    }
}
