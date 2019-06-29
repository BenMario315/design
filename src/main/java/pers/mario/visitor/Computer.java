package pers.mario.visitor;

/**
 * @Project: design
 * @PackageName: pers.mario.visitor
 * @FileName: Computer.java
 * @Description: The Computer is...
 * @Author: mario
 * @Time: 2019-06-28 18:02:22
 * @Version:V1.0.0
 */
public class Computer {
    public Computer(CPU cpu,HardDisk hardDisk){
        this.cpu = cpu;
        this.hardDisk = hardDisk;
    }

    public void accept(ComputerVisitor visitor){
        cpu.accept(visitor);
        hardDisk.accept(visitor);

    }

    private CPU cpu;
    private HardDisk hardDisk;

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }
}
