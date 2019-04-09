package pers.mario.factory.method;

/**
 * @Project: design
 * @PackageName: pers.mario.factory.method
 * @FileName: ToolBookFactory.java
 * @Description: The ToolBookFactory is...
 * @Author: mario
 * @Time: 2019-04-08 15:13:05
 * @Version:V1.0.0
 */
public class ToolBookFactory implements BookFactory {
    /**
     * 创建工具类书籍的工厂，返回的对象是Book的子类
     * @return book
     */
    @Override
    public Book create() {
        return new ToolBook();
    }
}
