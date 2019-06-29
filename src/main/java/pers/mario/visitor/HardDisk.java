package pers.mario.visitor;

/**
 * @Project: design
 * @PackageName: pers.mario.visitor
 * @FileName: HardDisk.java
 * @Description: The HardDisk is...
 * @Author: mario
 * @Time: 2019-06-28 17:52:15
 * @Version:V1.0.0
 */
public class HardDisk extends Hardware {

    public HardDisk(String name){
        super(name);
    }

    @Override
    public void accept(ComputerVisitor visitor) {
        visitor.visitor(this);
    }
}
