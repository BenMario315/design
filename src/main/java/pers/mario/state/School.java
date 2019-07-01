package pers.mario.state;

/**
 * @Project: design
 * @PackageName: pers.mario.state
 * @FileName: School.java
 * @Description: The School is...
 * @Author: mario
 * @Time: 2019-07-01 10:26:38
 * @Version:V1.0.0
 */
public class School {
    private AbstractCourse math = new MathClass("数学老师");
    private AbstractCourse biology = new BiologyClass("生物老师");

    private AbstractCourse now;

    public void study(){
        now.study();
    }

    public AbstractCourse getMath() {
        return math;
    }

    public void setMath(AbstractCourse math) {
        this.math = math;
    }

    public AbstractCourse getBiology() {
        return biology;
    }

    public void setBiology(AbstractCourse biology) {
        this.biology = biology;
    }

    public AbstractCourse getNow() {
        return now;
    }

    public void setNow(AbstractCourse now) {
        this.now = now;
    }
}
