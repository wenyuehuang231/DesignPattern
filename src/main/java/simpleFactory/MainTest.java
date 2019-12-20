package simpleFactory;

import simpleFactory.entity.JavaCourse;
import simpleFactory.factory.CourseFactory;
import simpleFactory.infer.Course;

/**
 * @author : Mr.Huang
 * @date : 2019/12/20 10:17
 */
public class MainTest {
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        Course course = factory.create(JavaCourse.class);
        course.record();

    }
}
