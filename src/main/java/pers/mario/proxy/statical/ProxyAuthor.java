package pers.mario.proxy.statical;

/**
 * @Project: design
 * @PackageName: pers.mario.proxy
 * @FileName: ProxyAuthor.java
 * @Description: The ProxyAuthor is...
 * @Author: mario
 * @Time: 2019-04-11 14:31:49
 * @Version:V1.0.0
 */
public class ProxyAuthor implements Author {

    private Author author;

    public ProxyAuthor(Author author) {
        this.author = author;
    }

    @Override
    public void write() {
        System.out.println("每次写作之前我都要喝杯咖啡，我刚喝完咖啡");
        author.write();
        System.out.println("写作完成了，签上我的名字送给你。");
    }
}
