package Singleton.HungrySingleton;

/**
 * @author : Mr.Huang
 * @date : 2019/12/20 15:59
 */
public class HungrySingleton {
    private static final HungrySingleton hugrySingleton = new HungrySingleton();
    private HungrySingleton() { }
    public static HungrySingleton getInstance() {
        return hugrySingleton;
    }
}
