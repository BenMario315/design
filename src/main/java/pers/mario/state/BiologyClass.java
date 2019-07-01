package pers.mario.state;

/**
 * @Project: design
 * @PackageName: pers.mario.state
 * @FileName: BiologyClass.java
 * @Description: The BiologyClass is...
 * @Author: mario
 * @Time: 2019-07-01 10:33:44
 * @Version:V1.0.0
 */
public class BiologyClass extends AbstractCourse {

    public BiologyClass(String teacherName) {
        super(teacherName);
    }

    @Override
    public void study() {
        System.out.println(this.getTeacherName() + "正在上生物课");
    }
}
