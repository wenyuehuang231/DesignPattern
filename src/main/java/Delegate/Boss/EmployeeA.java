package Delegate.Boss;

/**
 * created by Mr.huang on 2020/1/5
 */
public class EmployeeA implements IEmployee {

    @Override
    public void doing(String command) {
        System.out.println("我是员工A，我做" + command + "工作");
    }

}
