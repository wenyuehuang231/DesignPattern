package simpleFactory.factory;

import simpleFactory.infer.Course;

/**
 * @author : Mr.Huang
 * @date : 2019/12/20 10:21
 */
public class CourseFactory {

    public Course create(Class<? extends Course> clazz) {
        if (null != clazz) {
            try {
                return clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
