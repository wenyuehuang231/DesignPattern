package Delegate.Boss;

import java.util.HashMap;
import java.util.Map;

/**
 * created by Mr.huang on 2020/1/5
 */
public class Leader implements IEmployee {

    Map <String, IEmployee> targets = new HashMap<String, IEmployee>();

    public Leader() {
        this.targets.put("加密", new EmployeeA());
        this.targets.put("登录", new EmployeeB());
    }

    @Override
    public void doing(String command) {
        this.targets.get(command).doing(command);
    }

}
