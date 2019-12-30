package Singleton.HungrySingleton;

import java.io.Serializable;

/**
 * @author : Mr.Huang
 * @date : 2019/12/20 15:59
 */
public class HungrySingletonSerializable implements Serializable {
    private static final HungrySingletonSerializable hugrySingleton = new HungrySingletonSerializable();

    private HungrySingletonSerializable() { }

    public static HungrySingletonSerializable getInstance() {
        return hugrySingleton;
    }

    private Object readResolve(){ return hugrySingleton; }

}
