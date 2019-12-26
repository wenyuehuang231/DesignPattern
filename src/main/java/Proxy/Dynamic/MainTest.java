package Proxy.Dynamic;

/**
 * @author : Mr.Huang
 * @date : 2019/12/26 14:36
 */
public class MainTest {
    public static void main(String[] args) {
        try {
            Person obj = (Person)new JDKMeipo().getInstance(new Customer());
            obj.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
