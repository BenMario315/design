package pers.mario.visitor;

/**
 * @Project: design
 * @PackageName: pers.mario.visitor
 * @FileName: CPU.java
 * @Description: The CPU is...
 * @Author: mario
 * @Time: 2019-06-28 18:00:30
 * @Version:V1.0.0
 */
public class CPU extends Hardware {

    public CPU(String name) {
        super(name);
    }

    @Override
    public void accept(ComputerVisitor visitor) {
        visitor.visitor(this);
    }
}
