package Prototype;

import java.io.Serializable;

/**
 * @author : Mr.Huang
 * @date : 2019/12/25 11:38
 */
public class JinGuBang implements Serializable {
    public float h = 100;
    public float d = 10;
    public void big() {
        this.h *= 2;
        this.d *= 2;
    }

    public void small() {
        this.h /= 2;
        this.d /= 2;
    }

}
