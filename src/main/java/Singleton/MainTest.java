package Singleton;

/**
 * @author : Mr.Huang
 * @date : 2019/12/20 10:17
 */
public class MainTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("------End------");
    }
}
