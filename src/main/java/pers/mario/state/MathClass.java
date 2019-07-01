package pers.mario.state;

/**
 * @Project: design
 * @PackageName: pers.mario.state
 * @FileName: MathClass.java
 * @Description: The MathClass is...
 * @Author: mario
 * @Time: 2019-07-01 10:32:53
 * @Version:V1.0.0
 */
public class MathClass extends AbstractCourse {

    public MathClass(String teacherName) {
        super(teacherName);
    }

    @Override
    public void study() {
        System.out.println(this.getTeacherName() + "正在上数学课");
    }
}
