package pers.mario.factory.method;

/**
 * @Project: design
 * @PackageName: pers.mario.factory.method
 * @FileName: NovelBookFactory.java
 * @Description: The NovelBookFactory is...
 * @Author: mario
 * @Time: 2019-04-08 15:06:07
 * @Version:V1.0.0
 */
public class NovelBookFactory implements BookFactory {

    /**
     * 创建小说的工厂，返回的对象是Book的子类
     * @return book
     */
    public Book create() {
        return new NovelBook();
    }
}
