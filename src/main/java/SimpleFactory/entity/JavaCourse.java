package SimpleFactory.entity;

import SimpleFactory.infer.Course;

/**
 * @author : Mr.Huang
 * @date : 2019/12/20 10:19
 */
public class JavaCourse implements Course {

    @Override
    public void record() {
        System.out.println("录制java视频");
    }

}
