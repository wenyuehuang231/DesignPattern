package simpleFactory.entity;

import simpleFactory.infer.Course;

/**
 * @author : Mr.Huang
 * @date : 2019/12/20 10:20
 */
public class PythonCourse implements Course {

    @Override
    public void record() {
        System.out.println("录制Python视频");
    }

}
