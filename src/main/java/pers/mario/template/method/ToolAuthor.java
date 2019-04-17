package pers.mario.template.method;

/**
 * @Project: design
 * @PackageName: pers.mario.template.method
 * @FileName: ToolAuthor.java
 * @Description: The ToolAuthor is...
 * @Author: mario
 * @Time: 2019-04-17 16:10:17
 * @Version:V1.0.0
 */
public class ToolAuthor extends AbstractAuthor {
    @Override
    public void think() {
        System.out.println("我需要想一下今天写多少量");
    }

    @Override
    public void write() {
        System.out.println("一定要把今天定的量写完才能睡觉");
    }

    @Override
    public void sleep() {
        System.out.println("能睡觉，说明我肯定是完成了今天的任务");
    }
}
