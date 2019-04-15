package pers.mario.proxy.statical;

/**
 * @Project: design
 * @PackageName: pers.mario.proxy
 * @FileName: NovelAuthor.java
 * @Description: The NovelAuthor is...
 * @Author: mario
 * @Time: 2019-04-11 14:35:01
 * @Version:V1.0.0
 */
public class NovelAuthor implements Author {

    @Override
    public void write() {
        System.out.println("我是一个写小说的，现在要准备写小说了");
    }
}
