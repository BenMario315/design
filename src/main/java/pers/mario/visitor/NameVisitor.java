package pers.mario.visitor;

/**
 * @Project: design
 * @PackageName: pers.mario.visitor
 * @FileName: NameVisitor.java
 * @Description: The NameVisitor is...
 * @Author: mario
 * @Time: 2019-06-29 20:17:55
 * @Version:V1.0.0
 */
public class NameVisitor implements ComputerVisitor {
    @Override
    public void visitor(Hardware hardware) {
        System.out.println("访问者访问Name：" + hardware.getName());
    }
}
