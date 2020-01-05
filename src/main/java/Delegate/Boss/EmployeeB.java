package Delegate.Boss;

/**
 * created by Mr.huang on 2020/1/5
 */
public class EmployeeB implements IEmployee {

    @Override
    public void doing(String command) {
        System.out.println("我是员工B，我做" + command + "工作");
    }

}
