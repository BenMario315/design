package pers.mario.template.method;

/**
 * @Project: design
 * @PackageName: pers.mario.template.method
 * @FileName: AbstractAuthor.java
 * @Description: The AbstractAuthor is...
 * @Author: mario
 * @Time: 2019-04-17 16:04:47
 * @Version:V1.0.0
 */
public abstract class AbstractAuthor {
    public abstract void think();
    public abstract void write();
    public abstract void sleep();

    public void oneDay(){
        this.think();
        this.write();
        this.sleep();
    }
}
