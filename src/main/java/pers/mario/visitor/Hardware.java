package pers.mario.visitor;

/**
 * @Project: design
 * @PackageName: pers.mario.visitor
 * @FileName: Hardware.java
 * @Description: The Hardware is...
 * @Author: mario
 * @Time: 2019-06-28 17:43:35
 * @Version:V1.0.0
 */
public abstract class Hardware {
    private String name;

    public Hardware(String name){
        this.name = name;
    }

    public void run(){
        System.out.println(this.name+"运行了");
    }

    public abstract void accept(ComputerVisitor visitor);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
