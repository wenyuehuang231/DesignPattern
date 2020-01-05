package Delegate.Boss;

/**
 * created by Mr.huang on 2020/1/5
 */
public class DelegateTest {
    public static void main(String[] args) {
        new Boss().command("登录", new Leader());
    }
}
