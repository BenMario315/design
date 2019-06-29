package pers.mario.visitor;

/**
 * @Project: design
 * @PackageName: pers.mario.visitor
 * @FileName: RunVisitor.java
 * @Description: The RunVisitor is...
 * @Author: mario
 * @Time: 2019-06-29 20:20:20
 * @Version:V1.0.0
 */
public class RunVisitor implements ComputerVisitor {
    @Override
    public void visitor(Hardware hardware) {
        hardware.run();
    }
}
