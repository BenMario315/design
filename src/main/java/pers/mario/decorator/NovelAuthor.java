package pers.mario.decorator;

/**
 * @Project: design
 * @PackageName: pers.mario.decorator
 * @FileName: NovelAuthor.java
 * @Description: The NovelAuthor is...
 * @Author: mario
 * @Time: 2019-04-15 10:48:51
 * @Version:V1.0.0
 */
public class NovelAuthor implements Author {

    @Override
    public void write() {
        System.out.println("我是小说家，就写个小说吧");
    }

    @Override
    public void sign() {
        System.out.println("这本书要买了，我要签名后才可以");
    }
}
