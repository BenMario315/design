package pers.mario.state;

/**
 * @Project: design
 * @PackageName: pers.mario.state
 * @FileName: AbstractCourse.java
 * @Description: The AbstractCourse is...
 * @Author: mario
 * @Time: 2019-07-01 10:24:03
 * @Version:V1.0.0
 */
public abstract class AbstractCourse {
    public AbstractCourse(String teacherName) {
        this.teacherName = teacherName;
    }

    private String teacherName;

    public abstract void study();

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
