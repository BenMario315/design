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
    /**
     * 作家工作之前都需要思考
     */
    public abstract void think();

    /**
     * 思考清楚了才会开始写作
     */
    public abstract void write();

    /**
     * 累了就睡觉
     */
    public abstract void sleep();

    public void oneDay(){
        this.think();
        this.write();
        this.sleep();
    }
}
