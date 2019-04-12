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

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void write() {
        System.out.println("我是" + name + "，现在要准备写小说了");
    }
}
