package pers.mario.test;

import org.junit.Test;
import pers.mario.visitor.*;

/**
 * @Project: design
 * @PackageName: pers.mario.test
 * @FileName: VisitorTest.java
 * @Description: The VisitorTest is...
 * @Author: mario
 * @Time: 2019-06-28 18:01:25
 * @Version:V1.0.0
 */
public class VisitorTest {

    @Test
    public void visitorTest(){
        Computer computer = new Computer(new CPU("英特尔"),new HardDisk("固态硬盘"));

        computer.accept(new NameVisitor());

        computer.accept(new RunVisitor());
    }
}
