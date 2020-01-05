package Delegate.Boss;

/**
 * created by Mr.huang on 2020/1/5
 */
public class Boss {

    public void command(String command, Leader leader) {
        leader.doing(command);
    }

}
