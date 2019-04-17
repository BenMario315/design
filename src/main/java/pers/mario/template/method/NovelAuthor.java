package pers.mario.template.method;

/**
 * @Project: design
 * @PackageName: pers.mario.template.method
 * @FileName: NovelAuthor.java
 * @Description: The NovelAuthor is...
 * @Author: mario
 * @Time: 2019-04-17 16:08:37
 * @Version:V1.0.0
 */
public class NovelAuthor extends AbstractAuthor {
    @Override
    public void think() {
        System.out.println("我需要思考一下小说的结构");
    }

    @Override
    public void write() {
        System.out.println("想好了就开始写...");
    }

    @Override
    public void sleep() {
        System.out.println("不管有没有写完，今天都需要睡觉");
    }
}
